package com.example.rest.service;

import com.example.rest.dao.EmployeeDAO;
import com.example.rest.dao.EmployeeRepository;
import com.example.rest.dao.IEmployeeDAO;
import com.example.rest.model.Employee;
import com.example.rest.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private IEmployeeDAO employeeDao;
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employees getAllEmployees() {
        //return employeeDao.getAllEmployees();
        List<Employee> employeeList = employeeRepository.findAll();
        Employees emps = new Employees();
        emps.setEmployeeList(employeeList);
        return emps;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }
}
