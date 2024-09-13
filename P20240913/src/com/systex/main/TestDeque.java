package com.systex.main;

import java.util.Iterator;
import java.util.LinkedList;

public class TestDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Lemon");
		fruits.addLast("Watermelon");
		fruits.addFirst("Pineapple");
		fruits.push("Cherry");
		fruits.add("Strawberry");
		System.out.println(fruits);
		System.out.println(fruits.pollFirst());
		System.out.println(fruits);
		System.out.println(fruits.pollLast());
		System.out.println(fruits);
		System.out.println(fruits.poll());
		System.out.println("================");
		Iterator it = fruits.iterator();
		while(it.hasNext()) {
			String fruit = (String)it.next();
			System.out.println("Name: "+fruit+", Length: "+fruit.length());
		}
	}

}
