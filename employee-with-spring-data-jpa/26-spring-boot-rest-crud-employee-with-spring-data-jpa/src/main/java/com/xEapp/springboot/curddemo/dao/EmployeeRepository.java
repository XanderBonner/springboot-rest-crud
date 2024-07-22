package com.xEapp.springboot.curddemo.dao;

import com.xEapp.springboot.curddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//entity type is employee, and primary key is Integer since we are working with employeeId
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
