package com.systex.hr.model;

public class Director extends Manager {
	private double allowance;
	
	public Director(String name, String telephone, String address, String department, double allowance) {
		super(name, telephone, address, department);
		this.allowance = allowance;
	}
	

	public Director() {
		super();
	}


	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public Director(String department, double allowance) {
		super(department);
		this.allowance = allowance;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo()+"\t"+allowance;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return (int)(super.getSalary()*1.5);
	}
	
}
