package com.example.rest.controller;

import com.example.rest.model.Accounts;
import com.example.rest.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
