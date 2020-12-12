package com.example.rest.controller;

import com.example.rest.model.Account;
import com.example.rest.model.Employees;
import com.example.rest.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/accounts")
public class AccountController {
    @Autowired
    IAccountService accountService;

    @GetMapping(path="/", produces = "application/json")
    public List<Account> getEmployees()
    {
        return accountService.getAllAccounts();
    }
}
