package com.xEapp.springboot.curddemo.service;
import com.xEapp.springboot.curddemo.dao.EmployeeDAO;
import com.xEapp.springboot.curddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    //Need Instance variable
    private EmployeeDAO employeeDAO;

    //constructor
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }

    @Override
    public Employee findByID(int theId) {
        return employeeDAO.findByID(theId);
    }
    //we are moding the database so we need @Transactional
    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }
    //we are moding the database so we need @Transactional
    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);
    }
}
