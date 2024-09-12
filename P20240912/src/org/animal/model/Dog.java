package org.animal.model;

public class Dog implements Animal,Pet,Worker {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("汪汪汪");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	public void bar() {
		System.out.println("bar() implement in Dog");
	}
	
}
