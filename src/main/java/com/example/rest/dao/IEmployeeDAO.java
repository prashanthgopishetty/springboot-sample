package com.example.rest.dao;

import com.example.rest.model.Employee;
import com.example.rest.model.Employees;

public interface IEmployeeDAO {
    Employees getAllEmployees();
    void addEmployee(Employee employee);
}
