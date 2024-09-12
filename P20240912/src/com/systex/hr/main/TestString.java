package com.systex.hr.main;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "Hello";
		System.out.println(a==b);
		//System.out.println(a.equals(b));
		
		String c = new String("Hello");
		String d = new String("Hello");
		//System.out.println(c==d);
		

		System.out.println(b.equals(a));
		System.out.println(c.equals(d));
		System.out.println(a.equals(d));
		System.out.println("======================");
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.capacity());
		sb.append(" World!");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
