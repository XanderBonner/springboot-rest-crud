package com.xEapp.springboot.curddemo.dao;

import java.util.List;
import com.xEapp.springboot.curddemo.entity.Employee;

public interface EmployeeDAO {
    List<Employee> findAll();
}
