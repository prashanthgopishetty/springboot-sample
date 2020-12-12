package com.example.rest.dao;

import com.example.rest.model.Employee;
import com.example.rest.model.Employees;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO implements IEmployeeDAO
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Lokesh1", "Gupta", "howtodoinjava@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex2", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David3", "Kameron", "titanic@gmail.com"));
    }
    @Override
    public Employees getAllEmployees() 
    {
        return list;
    }

    @Override
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
