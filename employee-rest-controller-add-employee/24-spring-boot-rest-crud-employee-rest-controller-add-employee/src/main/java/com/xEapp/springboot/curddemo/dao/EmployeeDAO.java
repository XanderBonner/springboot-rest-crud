package com.xEapp.springboot.curddemo.dao;

import java.util.List;
import com.xEapp.springboot.curddemo.entity.Employee;

public interface EmployeeDAO {

    //add full CRUD support
    List<Employee> findAll();

    Employee findByID(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
