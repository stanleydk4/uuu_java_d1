package com.systex.model;

import java.util.Comparator;
import java.util.Objects;

public class MyDate implements Comparable<MyDate>{
	private int day;
	private int month;
	private int year;
	
	public static final Comparator<MyDate>YMD_COMP = new Comparator<MyDate>() {
		
		@Override
		public int compare(MyDate o1, MyDate o2) {
			// TODO Auto-generated method stub
			if(o1.getYear()>o2.getYear()) {
				return 1;
			}else if(o1.getYear()<o2.getYear()) {
				return -1;
			}else {
				if(o1.getMonth()>o2.getMonth()) {
					return 1;
				}else if(o1.getMonth()<o2.getMonth()) {
					return -1;
				}else {
					if(o1.getDay()>o2.getDay()) {
						return 1;
					}else if(o1.getDay()<o2.getDay()) {
						return -1;
					}else {
						return 0;
					}
				}
			}
		}
	};
	
	
	
	public MyDate() {
		super();
	}

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "/" +month + "/" + year + "\t[day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	public String toString2() {
		return year + "/" +month + "/" + day + "\t[year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	@Override
	public int compareTo(MyDate o) {
		if(this.year>o.year) {
			return 1;
		}else if(this.year<o.year) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
}

