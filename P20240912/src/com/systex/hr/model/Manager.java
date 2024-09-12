package com.systex.hr.model;

public class Manager extends Employee {
	private String department;

	public Manager() {

	}

	public String getDepartment() {
		return department;
	}
	
	public Manager(String name, String telephone, String address, String department) {
		super(name, telephone, address);
		this.department = department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Manager(String department) {
		super();
		this.department = department;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo()+"\t"+department;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return (int)((super.getSalary()*3)+5000);
	}
	
	
}
