package com.systex.hr.main;

import com.systex.hr.model.Account;

import static com.systex.hr.model.Account.*;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println(Account.getInterestRate());
		Account acct1 = new Account(100);
		System.out.println(acct1.getInterestRate());
		Account acct2 = new Account(200);
		System.out.println(getInterestRate());
		Account.setInterestRate(-0.03);
		
		System.out.println(acct1.getInterestRate());
		System.out.println(acct2.getInterestRate());
		
		int r = 5;
		System.out.println(Math.PI*Math.pow(r, 2));
		long end = System.currentTimeMillis();
		System.out.println("spend "+(end-start)+" ms");
		
		
		
	}

}
