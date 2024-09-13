package com.systex.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> fruits = new TreeMap<>();
		
//		fruits.put(7, "Guava");
//		fruits.put(2, "Lemon");
//		fruits.put(4, "Watermelon");
//		fruits.put(1, "Pineapple");
//		fruits.put(5, "Cherry");
//		fruits.put(6, "Coconut");
//		fruits.put(3, "Strawberry");
		
		fruits.put("seven", "Guava");
		fruits.put("two", "Lemon");
		fruits.put("four", "Watermelon");
		fruits.put("one", "Pineapple");
		fruits.put("five", "Cherry");
		fruits.put("six", "Coconut");
		fruits.put("three", "Strawberry");
		
		System.out.println(fruits);
		
		fruits.put("six","Sparrow");
		System.out.println(fruits);
		System.out.println("======================");
		Set<String> keys = fruits.keySet();
		for(String key:keys) {
			String value = fruits.get(key);
			System.out.println("Key = "+key+". value = "+value+", length = "+value.length());
		}
		
		System.out.println("======================");
		for(Map.Entry<String, String>entry:fruits.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key = "+key+". value = "+value+", length = "+value.length());
		}
		System.out.println("======================");
		fruits.forEach((key,value)->System.out.println("Key = "+key+". value = "+value+", length = "+value.length()));
		
		
	}

}
