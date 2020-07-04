package com.cognizant.account.model;

public class Account {
	private int number;
	private String type;
	private double balance;
    public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int number, String type, double balance) {
		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
