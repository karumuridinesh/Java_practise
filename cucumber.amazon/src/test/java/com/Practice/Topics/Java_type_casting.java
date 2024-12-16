package com.Practice.Topics;

public class Java_type_casting {

	public static void main(String[] args) {
		// Type casting is when you assign a value of one primitive data type to another primitive data type
		// 1. Widening type casting (Automatically) - converting data type done by automatically from smaller size to larger size   
		//  byte-> short-> char-> int -> long-> float-> double
		byte mybyte = 89;
		System.out.println(mybyte);
		
		short myshort = mybyte ;
		System.out.println(myshort);
	
		char mychr= (char) myshort;		// narrowing type casting
		System.out.println(mychr);
		
		char mychar= 'x';
		System.out.println(mychar);
		
		int myint = mychar;
		System.out.println(myint);
		
		long mylong = myint;
		System.out.println(mylong);
		
		float myfloat = mylong;
		System.out.println(myfloat);
		
		double mydouble = myfloat;
		System.out.println(mydouble);
		
		// 2. Narrowing tyope casting (Manually) -> converting data type done by manually placing type parentheses from larger size to smaller size
		//double-> float-> long-> int-> char-> short-> byte
		System.out.println("Narrowing type casting");
		double mydb = 3e2d;
		System.out.println(mydb);
		
		float myfl = (float) mydb;
		System.out.println(myfl);
		
		long myln = (long) myfl;
		System.out.println(myln);
	
		int myin = (int)myln;
		System.out.println(myin);
		
		char mycr = (char) myin;
		System.out.println(mycr);
		
		short mysh = (short) mycr;
		System.out.println(mysh);
		
		byte mybt = (byte) mysh;
		System.out.println(mybt);
		
		
	
	}

}
