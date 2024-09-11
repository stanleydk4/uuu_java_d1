package com.systex.main;

public class TestForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		for(; i<10 ; i++) {
			System.out.println("Loop"+i);
		}
		System.out.println(i);
		
		int x = 0; 
		for(;;) {
			System.out.println("Endless"+x++);
			if(x==100) {
				
			}
		}
	}

}
