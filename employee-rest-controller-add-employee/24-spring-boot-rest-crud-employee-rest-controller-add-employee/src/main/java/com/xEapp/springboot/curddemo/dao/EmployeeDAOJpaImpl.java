package com.xEapp.springboot.curddemo.dao;

import com.xEapp.springboot.curddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    //define field for entitymanager
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll(){

        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);
        //execute query and get result list
        List<Employee> employees = theQuery.getResultList();
        //return the results
        return employees;
    }

    @Override
    public Employee findByID(int theId) {

        //get employee
        Employee theEmployee = entityManager.find(Employee.class, theId);
        //return employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {

        //save employee, remember merge will either save or update. if id == 0, the save, if != 0 then update
        // another way to view it. If id == 0 then insert/save, else update
        Employee dbEmployee = entityManager.merge(theEmployee);
        //return the dbEmployee
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {
        //find employee by Id
        Employee theEmployee = entityManager.find(Employee.class, theId);
        //remove employee
        entityManager.remove(theEmployee);
    }
}
