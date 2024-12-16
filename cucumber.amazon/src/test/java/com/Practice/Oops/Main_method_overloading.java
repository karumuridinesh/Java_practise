package com.Practice.Oops;

public class Main_method_overloading {
	/*
	 	We can create main methods by changing number of parameters
	  	We should not create same main method(create main methods with different parameters)
	  	public static void main(String[] args) {	}
			1.Run & execution starts from this method only
			2.We can't create duplicate for this method
			3.Output will produce based upon the implementation of the code in this method
	 */
	
	public static void main() {
		System.out.println(".............");
	}
	public static void main(int x) {
		x=10;
		System.out.println("Number is : "+x);
	}
	public static void main(String y) {
		y="Java";
		System.out.println("Language name is : "+y);
	}
	public static void main(String[] args) {
		main();
		main(12);
		main("C++");
		
	}
//	public static void main(String[] args) {
//		main();
//		main(12);
//		main("C++");	
//	}

}
