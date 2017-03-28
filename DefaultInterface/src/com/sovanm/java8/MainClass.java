package com.sovanm.java8;

public class MainClass {

	public static void main(String...args){
		
		DefaultInterfaceImpl di = new DefaultInterfaceImpl();
		
		// This will print the sum of all default methods and the overridden method from the implementing class
		
		System.out.println(di.defaultInterfaceSum(10, 23));
	}
}
