package com.cognizant.loan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cognizant.loan.LoanApplication;
import com.cognizant.loan.model.Loan;
import com.cognizant.loan.service.LoanService;

@RestController
@RequestMapping("/loans")
public class LoanController {
	@Autowired
	LoanService ls;
    private Logger LOGGER = LoggerFactory.getLogger(LoanApplication.class);
	@GetMapping("/{number}")
   public Loan getLoan(@PathVariable int number){
	   LOGGER.info("START CONTROLLER getLoan");
	   LOGGER.info(Integer.toString(number));
	   Loan loan = ls.getLoan(number);
	   LOGGER.info("END CONTROLLER getLoan");
	   return loan;
   }
}
