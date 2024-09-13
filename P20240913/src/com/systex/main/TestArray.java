package com.systex.main;

import java.util.Arrays;

import com.systex.util.MyMath;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] friends = {"Gary","Patty","Mary","Kevin","Louis"};
		int[] grades; 
		grades = new int[]{98,88,75,66,100};
		
		System.out.println(Arrays.toString(friends));
		System.out.println(Arrays.toString(grades));
		
		for(int i=0; i<friends.length;i++) {
			System.out.println(friends[i]);
		}
		System.out.println("===============");
		
		for(String friend:friends) {
			System.out.println(friend);
		}
		
		int [][] numbers = {
				{99,98,95,88,79},
				{33,65,12,77},
				{88,99,70},
				{100,99,98,97,96,95},
				{88,56,44,79,12}
		};
		
		System.out.println(Arrays.deepToString(numbers));
		System.out.println("===============");
		
		for(int i =0;i<numbers.length;i++) {
			int sum = 0;
			for(int j=0;j<numbers[i].length;j++) {
				sum += numbers[i][j];
			}
			System.out.println((double)sum / numbers[i].length);
	
		}
		
		for(int[] x:numbers) {
			int sum = 0;
			for(int y:x) {
				sum+=y;
			}
			System.out.println((double)sum / x.length);
		}
		String[] names = {"Gary","Patty","Mary","Kevin","Louis"};
		String[] newNames = {"a","b","c","d","f","g","h","i","j"};
		System.arraycopy(names,0,newNames,0,names.length);
		names = newNames;
		System.out.println(Arrays.toString(names));
		System.out.println(MyMath.average(1,2,3,4,5,6,7,8,9,10));
		System.out.println(MyMath.average(1,2,3,4,5,12.345,'A'));
		System.out.println(MyMath.average());
	}

}
