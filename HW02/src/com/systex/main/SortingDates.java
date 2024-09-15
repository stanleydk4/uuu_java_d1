package com.systex.main;

import java.util.Collections;
import java.util.LinkedList;

import com.systex.model.MyDate;

public class SortingDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<MyDate> dates = new LinkedList<>();
		dates.add(new MyDate(13,9,2024));
		dates.add(new MyDate(11,2,2024));
		dates.add(new MyDate(5,6,2015));
		dates.add(new MyDate(8,2,2025));
		dates.add(new MyDate(25,2,2025));
		dates.add(new MyDate(30,1,2008));
		dates.add(new MyDate(22,3,2024));
		dates.add(new MyDate(17,2,2025));
		dates.add(new MyDate(19,6,2015));
		
		//Please enter 0 or 1 to determine sorting the dates ascendant or descendant
		int sortNum = Integer.parseInt(args[0]);
		
		//Please enter 0 or 1 to determine showing the dates DD/MM/YYYY or YYYY/MM/DD
		int showNum = Integer.parseInt(args[1]);
		
		if(sortNum == 0) {
			Collections.sort(dates,MyDate.YMD_COMP);
		}else if(sortNum == 1) {
			Collections.sort(dates,MyDate.YMD_COMP.reversed());
		}
		
		
		if(showNum == 0) {
			dates.forEach(d->System.out.println(d));
		}else if(showNum == 1){
			dates.forEach(d->System.out.println(d.toString2()));
		}

	}

}
