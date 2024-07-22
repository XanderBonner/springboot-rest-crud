package com.xEapp.springboot.curddemo.dao;

import com.xEapp.springboot.curddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//entity type is employee, and primary key is Integer since we are working with employeeId

//@RepositoryRestResource(path="members") //how to change endpoint name (or path)
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
