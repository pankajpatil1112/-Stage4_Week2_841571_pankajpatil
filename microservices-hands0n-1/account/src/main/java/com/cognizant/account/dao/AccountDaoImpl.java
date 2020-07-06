package com.cognizant.account.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.account.AccountApplication;
import com.cognizant.account.model.Account;
@Component
public class AccountDaoImpl implements AccountDao{
   private Logger LOGGER = LoggerFactory.getLogger(AccountApplication.class);
	@Override
	public Account getAccount(int number) {
		// TODO Auto-generated method stub
		LOGGER.info("START getAccountDao");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"account.xml");
		Account account = context.getBean("acc1",
				Account.class);
		LOGGER.info("END getAccountDao");
		return account;
	}

}
