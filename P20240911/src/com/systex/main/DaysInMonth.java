package com.systex.main;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		switch(month) {
			case 2:
				if( (year%400==0) ||( (year%4==0) && (year%100!=0) ) ) {
					System.out.println(year+"年的"+month+"月有29天");
				}else {
					System.out.println(year+"年的"+month+"月有28天");
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(year+"年的"+month+"月有31天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(year+"年的"+month+"月有30天");
				break;
			default:
				System.out.println("請輸入有效月份");
		}
		
	}

}
