package com.systex.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new Vector();
		fruits.add("Lemon");
		fruits.add("Watermelon");
		fruits.add("Pineapple");
		fruits.add("Cherry");
		fruits.add("Strawberry");
		fruits.add("Cherry");
		
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);
		System.out.println("================");
		for(int i=0;i<fruits.size();i++) {
			String fruit = (String)fruits.get(i);
			System.out.println("Name: "+fruit+", Length: "+fruit.length());
		}
		System.out.println("================");
		Iterator it = fruits.iterator();
		while(it.hasNext()) {
			String fruit = (String)it.next();
			System.out.println("Name: "+fruit+", Length: "+fruit.length());
		}
		System.out.println("================");
		for(String fruit:fruits) {
			System.out.println("Name: "+fruit+", Length: "+fruit.length());
		}
		System.out.println("================");
		fruits.forEach(null);
	}

}
