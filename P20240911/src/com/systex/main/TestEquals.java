package com.systex.main;

import com.systex.model.MyDate;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate d1 = new MyDate();
		MyDate d2 =  new MyDate();
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
		Integer wAmount = 10000;
		int balance = 5000;
		balance += wAmount;//Auto-unboxing
		System.out.println("balance = "+balance);
	}

}
