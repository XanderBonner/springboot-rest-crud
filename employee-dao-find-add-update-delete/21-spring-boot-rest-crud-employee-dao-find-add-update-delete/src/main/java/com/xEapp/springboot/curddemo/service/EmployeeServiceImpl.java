package com.xEapp.springboot.curddemo.service;
import com.xEapp.springboot.curddemo.dao.EmployeeDAO;
import com.xEapp.springboot.curddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}
