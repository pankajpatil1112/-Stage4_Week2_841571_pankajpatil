package com.cognizant.account.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cognizant.account.AccountApplication;
import com.cognizant.account.dao.AccountDaoImpl;
import com.cognizant.account.model.Account;
@Service
public  class AccountServiceImpl implements AccountService{
	 private Logger LOGGER = LoggerFactory.getLogger(AccountApplication.class);
	public Account getAccount(int number) {
		// TODO Auto-generated method stub
		LOGGER.info("START getAccountService");
		LOGGER.info("END getAccountService");
		return new AccountDaoImpl().getAccount(number);
		
	}

}
