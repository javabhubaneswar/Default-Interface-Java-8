package com.sovanm.java8;

/**
 * 
 * @author sovanm
 * This class implements both the interfaces and implements the methods declared in
 * those interfaces as well as the default method. 
 * There is a rule for default method
 * 	- If both the interface have same default method, then the implementing class 
 * 	  has to override it, otherwise a compile time error "Duplicate Default Method" arises
 *  - In in case we need to use the default method of individual interface, we have to 
 *    use "super" with the interface name to access it. 
 * 
 * NB : It is not mandatory to override the default method, if they of different signatures
 */
public class DefaultInterfaceImpl implements 
							DefaultInterfaceFirst,
							DefaultInterfaceSecond {

	/**
	 * This is mandatory to implement the definition of the declared 
	 * methods in the interface  
	 * */
	
	@Override
	public void onlyMethSignature() {
		System.out.println("First Overriden Method implemented "
				+ "from First Interface ");

	}

	@Override
	public void onlyMethSignature2() {
		System.out.println("Second Overriden Method implemented "
				+ "from First Interface ");

	}
	
	@Override
	public void onlyMethSignature3() {
		System.out.println("First Overriden Method implemented "
				+ "from Second Interface ");
	}
	
	
	/**
	 * This overrides the default method from both the interface and if this is not done,
	 * then JVM will generate compile time errors about duplicate default methods found
	 * 
	 * To use the default interface from individual interface, we need to use with 
	 * super. See below
	 */
	@Override
	public int defaultInterfaceSum(int i1, int i2) {
		
		System.out.println("Overriden default method but executed the default "
				+ "interface from First interface");
		
		// This calls the default method from first interface
		int firstDefaultMethod = DefaultInterfaceFirst.super.defaultInterfaceSum(i1, i2);
		
		// This calls the default method from second interface
		int secondDefaultMethod = DefaultInterfaceSecond.super.defaultInterfaceSum(24,45);
		
		// This sums of the arguments received from the overridden default method in class
		int sumFromOverrideMethod = i1 + i2;
		
		// Finally returning all the sum
		return firstDefaultMethod + secondDefaultMethod + sumFromOverrideMethod;
	}

}
