package com.xEapp.springboot.curddemo.rest;

import com.xEapp.springboot.curddemo.dao.EmployeeDAO;
import com.xEapp.springboot.curddemo.entity.Employee;
import com.xEapp.springboot.curddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    //instance variables
    private EmployeeService employeeService;

    //quick and diry: inject employee dao
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }
    //expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
