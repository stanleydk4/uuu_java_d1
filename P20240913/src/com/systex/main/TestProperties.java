package com.systex.main;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = System.getProperties();
		Enumeration propsNames = props.propertyNames();
		while(propsNames.hasMoreElements()) {
			String propName = (String)propsNames.nextElement();
			String propValue = props.getProperty(propName);
			System.out.println("Property: "+propName+"is"+propValue);
		}
	}

}
