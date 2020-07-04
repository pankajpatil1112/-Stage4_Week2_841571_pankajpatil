package com.cognizant.loan.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.cognizant.loan.LoanApplication;
import com.cognizant.loan.model.Loan;

public class LoanDaoImpl implements LoanDao{
	 private Logger LOGGER = LoggerFactory.getLogger(LoanApplication.class);
		
	@Override
	public Loan getLoan(int number) {
		// TODO Auto-generated method stub
		LOGGER.info("START getLoanDao");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"loan.xml");
		Loan loan = context.getBean("loan",
				Loan.class);
		LOGGER.info("END getLoanDao");
		return loan;
		
	}

}
