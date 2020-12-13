package com.example.rest.controller;

import com.example.rest.model.Accounts;
import com.example.rest.model.Employee;
import com.example.rest.model.Employees;
import com.example.rest.service.IAccountService;
import com.example.rest.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/accounts")
public class AccountController
{
    @Autowired
    private IAccountService accountService;
    
    @GetMapping(path="/", produces = "application/json")
    public Accounts getEmployees()
    {
        return accountService.getAllAccounts();
    }
    

}
