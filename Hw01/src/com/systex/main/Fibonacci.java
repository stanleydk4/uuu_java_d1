package com.systex.main;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNum = Integer.parseInt(args[0]);
		int currentNum =1;
		int lastNum = 0;
		int temp = 0;
		System.out.print(lastNum+" ");
		while(currentNum <= maxNum) {
			System.out.print(currentNum+" ");
			temp = currentNum;
			currentNum += lastNum;
			lastNum = temp;
		}
	}

}
