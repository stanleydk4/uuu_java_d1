package com.systex.hr.main;

import com.systex.hr.model.Accountant;
import com.systex.hr.model.Director;
import com.systex.hr.model.Employee;
import com.systex.hr.model.Engineer;
import com.systex.hr.model.Manager;
import com.systex.hr.model.Secretary;
import com.systex.hr.service.StaffService;

public class HRMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer e1 = new Engineer("Kevin", "25149588", "Taipei", "CRM");
		Engineer e2 = new Engineer("Mary", "25149515", "Taipei", "CRM");
		Engineer e3 = new Engineer("Gary", "25141251", "Taoyuan", "HR");
		Manager m1 = new Manager("Richard","54846364","Taipei","IT");
		Manager m2 = new Manager("Kelly","56456432","Taipei","Education");
		Accountant a1 = new Accountant("Frank", "8158135", "Taipei", "IT");
		Director d1 = new Director("Hank","25135721","Taipei","IT",20000);
		Secretary s1 = new Secretary("Peggie", "154654354", "Taipei", "Frank");
		
		Employee[] staff = {e1,e2,e3,m1,m2,a1,d1,s1};
		StaffService service = new StaffService();
		System.out.println("員工報表");
		System.out.println("================================================================");
		System.out.println("姓名\t電話\t\t地址\tMisc");
		System.out.println("================================================================");
		service.generateReport(staff);
		System.out.println("================================================================");
		System.out.println("薪資總額="+service.calcAllSalary(staff));
		
		
	}

}
