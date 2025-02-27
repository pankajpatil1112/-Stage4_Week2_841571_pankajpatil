package com.cognizant.loan.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



import com.cognizant.loan.LoanApplication;
import com.cognizant.loan.dao.LoanDaoImpl;
import com.cognizant.loan.model.Loan;
@Service
public class LoanServiceImp implements LoanService{
	 private Logger LOGGER = LoggerFactory.getLogger(LoanApplication.class);

	@Override
	public Loan getLoan(int number) {
		LOGGER.info("START getLoanService");
		LOGGER.info("END getLoanService");
		return new LoanDaoImpl().getLoan(number);
	}

}
