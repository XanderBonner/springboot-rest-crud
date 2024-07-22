package com.xEapp.springboot.curddemo.service;

import com.xEapp.springboot.curddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    //Define methods for EmployeeService
    List<Employee> findAll();

    Employee findByID(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
