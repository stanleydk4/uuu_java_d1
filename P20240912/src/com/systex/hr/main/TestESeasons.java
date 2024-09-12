package com.systex.hr.main;

import com.systex.hr.model.ESeasons;

public class TestESeasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ESeasons.SPRING);
		for(ESeasons es:ESeasons.values()) {
			System.out.println(es+", ordinal = "+es.ordinal()+", name = "+es.name());
		}
	}

}
