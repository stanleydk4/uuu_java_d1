package com.systex.main;

import java.util.GregorianCalendar;

import com.systex.model.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("A123456789","甘羽","月海亭",new GregorianCalendar(2008,9,11).getTime(),
				'F',false,"Ganyu@genshin.com");
		System.out.println(c1);
		Customer c2 = new Customer("A123456788","心海","珊瑚宮",new GregorianCalendar(2025,9,11).getTime(),
				'G',false,"Kokomi@genshin.com");
		System.out.println(c2);
	}

}
