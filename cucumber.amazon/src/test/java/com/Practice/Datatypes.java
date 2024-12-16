package com.Practice;

public class Datatypes {

	public static void main(String[] args) {
		//Primitive Data types - reserved keyword by the language  
		
		// Numeric types
		byte  a; // 1 byte   -  stores -128 to 127
		byte mybyte = 100;
		System.out.println(mybyte);
		
		short b; // 2 bytes  -  stores -32,768 to 32,767
		short myshort = 3000;
		System.out.println(myshort);
		
		int c;	// 4 bytes   -  stores -2,147,483,648 to 2,147,483,647
		int myint = 40000;
		System.out.println(myint);
		
		long d;	// 8 bytes	 -  stores -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long mylong = 10000000L;
		System.out.println(mylong);
		
		
		// Floating point types
		float e;	// 4 bytes	-  stores 6 to 7 decimal values
		float myfloat = 5.67f;
		System.out.println(myfloat);
		
		double f;	// 8 bytes	-  stores up to 15 decimal values
		double mydouble = 5.6799d;
		System.out.println(mydouble);
		
		// Scientific Numbers - floating point number can also be a scientific number with an "e" or to indicate the power of 10.
		float fl = 5e2f;
		System.out.println(fl);
		double db =10E3d;
		System.out.println(db);
		
		boolean g;	// 1 byte	-  stores true or false
		boolean bln = true;
		System.out.println(bln);
		boolean myboolean = false;
		System.out.println(myboolean);
		
		char h;		// 2 bytes	-  stores single character/ letter or ASCI value
		char mychar = 'i';
		System.out.println(mychar);				
		 // Use ASCII values of certain characters
		char mycharvalue = 67;  // C
		System.out.println(mycharvalue);
		
		// Write a program by using Primitive data types
		int groceries = 20;
		float cost = 32e1f;
		char currency = '$';
		float total_bill = groceries * cost ;
		
		System.out.println("Items purchased: "+ groceries);
		System.out.println("Price of the each item is: "+ cost);
		System.out.println("Total amount is: " + total_bill+currency);
		
		
		//Non- primitive data types - 'reference variables' or 'object references'as they reference a memory location where data is stored
		// these are called reference types
		
		String str;  // String - stores String data
		String mystr = "Hello world";
		System.out.println(mystr);
		
		int [] ar;	// Array 	- stores integer type values
		int Ar[];
		class cl {}  // Class	- stores user defined and predefined data
		class Cl {}	
		/*
		 1.Non-Primitive data types can be used to call methods to perform operations but Primitive data types are not 
		 2.Primitive data types always has a value, non-primitive data types can be null
		 3.Primitive data types starts with Lower case, Non-primitive data types starts with Upper case(lower case is also working but Uppers case is rule)  		 
		 */
		


	}

}
