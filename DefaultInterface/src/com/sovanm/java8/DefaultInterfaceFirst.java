package com.sovanm.java8;

/**
 * 
 * @author sovanm
 *
 * This is the first Interface having two declaration and a default method. 
 */
public interface DefaultInterfaceFirst {

	/**
	 * Interface Declaration for first interface
	 */
	void onlyMethSignature();
	void onlyMethSignature2();
	
	/**
	 * Default Interface to calculate sum of 2 numbers
	 */
	default int  defaultInterfaceSum(int i1, int i2){
		
		System.out.println("Sum method from First Interface");
		
		return i1 + i2;
	}
}
