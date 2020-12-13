package com.example.rest.controller;

import com.example.rest.model.Account;
import com.example.rest.model.Employees;
import com.example.rest.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/accounts")
public class AccountController {
    @Autowired
    IAccountService accountService;

    @GetMapping(path="/")
    public List<Account> getEmployees()
    {
//        Account[] accountsArray = new Account[2];
//        accountsArray[0] = new Account(1, "name1", "fn1","ln1", "123455");
//        accountsArray[2] = new Account(2, "name2", "fn2","ln2", "654321");
//        return Arrays.asList(accountsArray);
        return accountService.getAllAccounts();
    }
}
