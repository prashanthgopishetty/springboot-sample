package com.example.rest.service;

import com.example.rest.model.Employee;
import com.example.rest.model.Employees;

public interface IEmployeeService {
    Employees getAllEmployees();
    void addEmployee(Employee employee);
}
