package com.systex.main;

import java.util.Random;
import java.util.TreeSet;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		String exludeString = args[1];
		Random random = new Random();
		
		String[] exludeNum = exludeString.split(" ");
		TreeSet<Integer> excludeNumSet = new TreeSet<>();
		
		for(int i=0; i<exludeNum.length ; i++) {
			excludeNumSet.add(Integer.parseInt(exludeNum[i]));
		}

//		for (int n : excludeNumSet) {
//            System.out.println(n);
//        }
		System.out.println("Excluded Number: "+excludeNumSet);
		System.out.println();
		TreeSet<Integer> generatedSet = new TreeSet<>();
		
		for(int i=0; i<num ;i++) {
			while(generatedSet.size()<6) {
				int n = random.nextInt(49) + 1;
				
				for(int j=0; j<excludeNumSet.size() ;j++) {
					if(!excludeNumSet.contains(n)){
						generatedSet.add(n);
					}
				}
			}
	
			System.out.println("Generated Number Set"+(i+1)+": "+generatedSet);
			generatedSet.clear();
		}
		
		
	}

}
