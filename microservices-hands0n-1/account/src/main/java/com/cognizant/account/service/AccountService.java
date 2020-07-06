package com.cognizant.account.service;

import org.springframework.stereotype.Component;

import com.cognizant.account.model.Account;
@Component
public interface AccountService {
    public Account getAccount(int number);
}
