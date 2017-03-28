package com.sovanm.java8;

/**
 * 
 * @author sovanm
 *
 * This is the second Interface which has a single default method but exactly same as the signature
 * but doing some extra operations for sum 
 */
public interface DefaultInterfaceSecond {
	
	/**
	 *  Interface Declaration for first interface
	 * */
	
	void onlyMethSignature3();
	
	/**
	 * Default Interface to calculate sum of 2 numbers
	 */
	default int  defaultInterfaceSum(int i1, int i2){
		
		System.out.println("Sum method from Second Interface");
		return (i1 + i2) * 2 ;
	}
}
