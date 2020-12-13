package com.example.rest.service;

import com.example.rest.dao.AccountRepository;
import com.example.rest.model.Account;
import com.example.rest.model.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements  IAccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public Accounts getAllAccounts() {
        List<Account> accountsList = accountRepository.findAll();
        Accounts accounts = new Accounts();
        accounts.setAccountList(accountsList);
        return accounts;
        //return accountRepository.findAll();
    }
}
