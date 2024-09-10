package com.systex.model;

public class TestScoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Scoping.a);
	}
	
	public void callMe(int c,int d) {
		int e;
		if(c>10) {
			int f = 100;
			System.out.println("f= "+f);
		}
	}
	
	long g = 12345678900L;
	
	float h = 12.456f;//float 要加f,符點數預設為double
	

}
