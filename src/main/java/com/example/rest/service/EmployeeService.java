package com.example.rest.service;

import com.example.rest.dao.EmployeeDAO;
import com.example.rest.dao.IEmployeeDAO;
import com.example.rest.model.Employee;
import com.example.rest.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private IEmployeeDAO employeeDao;

    @Override
    public Employees getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }
}
