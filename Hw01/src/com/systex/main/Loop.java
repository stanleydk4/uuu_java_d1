package com.systex.main;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loopNum = Integer.parseInt(args[0]);
		int num = Integer.parseInt(args[1]);
		System.out.println("Loop"+args[0]+":");
		switch (loopNum) {
			case 1:
				Loop1(num);
				break;
			case 2:
				Loop2(num);
				break;
			case 3:
				Loop3(num);
				break;
			case 4:
				Loop4(num);
				break;
			case 5:
				Loop5(num);
				break;
			case 6:
				Loop6(num);
				break;
			case 7:
				Loop7(num);
				break;
		}
	}
	
	public static void Loop1(int a) {
		for(int i=0; i<=a; i++) {
			for(int j=0; j<i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Loop2(int a) {
		for(int i=a; i>=0; i--) {
			for(int j=i; j>0 ;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Loop3(int a) {
		int ct = 0;
		for(int i=a; i>0; i--) {
			for(int j=i-1; j>0 ;j--) {
				System.out.print(" ");
			}
			ct++;
			for(int j=0; j<ct ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Loop4(int a) {
		int ct = 0;
		for(int i=a; i>0; i--) {
			for(int j=i-1; j>0 ;j--) {
				System.out.print(" ");
			}
			ct++;
			for(int j=0; j<ct ;j++) {
				System.out.print("*");
			}
			for(int j=1; j<ct ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Loop5(int a) {
		int ct = 0;
		for(int i=0; i<a; i++) {
			for(int j=0; j<i ;j++) {
				System.out.print(" ");
			}
			for(int j=(a-ct++); j>0 ;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Loop6(int a) {
		int ct = 0;
		for(int i=a; i>0; i--) {
			for(int j=0; j<ct ;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(a-ct) ;j++) {
				System.out.print("*");
			}
			for(int j=1; j<=(a-ct-1) ;j++) {
				System.out.print("*");
			}
			ct++;
			System.out.println();
		}
	}
	
	public static void Loop7(int a) {
		int ct = 0;
		for(int i=a; i>0; i--) {
			for(int j=i; j>0 ;j--) {
				System.out.print(" ");
			}
			ct++;
			for(int j=0; j<ct-1 ;j++) {
				System.out.print("*");
			}
			for(int j=1; j<ct-1 ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		Loop6(a);
	}
}
