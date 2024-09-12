package com.systex.hr.model;

public class Account {
	private static double interestRate;
	private int balance;
	private final double MYCONST = 0;

	private static final int MYCONST2;
	
	static {
		System.out.println("hello static block!");
		//
		MYCONST2 = 500;
		//
		//
		//
		interestRate = 0.02;
	}
	
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		if(interestRate>=0) {	
			Account.interestRate = interestRate;
		}else {
			Account.interestRate = 0;
		}
	}
	public Account(int bal) {
		balance = bal;
	}
	public int getBalance() {
		final int LOCAL_CONST=300;
		System.out.println(LOCAL_CONST);
		return balance;
	}
	public void deposit(int amt) {
		this.balance +=amt;
	}
	
	public void withdraw(int amt) {
		this.balance -= amt;
	}
}
