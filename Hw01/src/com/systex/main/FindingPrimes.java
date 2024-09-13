package com.systex.main;

public class FindingPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0,ct = 1;
		int maxNum = Integer.parseInt(args[0]);
		System.out.print("2 ");
		for(int i = 3; i<maxNum; i+=2) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
				
			}
			if(flag==0) {
				System.out.print(i+" ");
				ct++;
			}
			flag=0;
		}
		System.out.println();
		System.out.println("共"+ct+"個");
	}

}
