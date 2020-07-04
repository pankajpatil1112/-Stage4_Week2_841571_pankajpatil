package com.cognizant.loan.service;

import org.springframework.stereotype.Service;

import com.cognizant.loan.model.Loan;

@Service
public interface LoanService {
   public Loan getLoan(int number);
}
