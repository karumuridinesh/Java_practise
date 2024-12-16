package com.Practice;
//In Java, class name is must match with file name. Java allows code reused and low cost.
//Java is programming language,it is object oriented language, secured, faster and open source language.
//single line comment - // commented line
/* multiple line comments = /* commented lines */

public class Variables {
	/*
	 	Variables are three types
	 		1.Local variables:		
	 			Declared with in the method
	 			Direct access
	 		2.Instance variables: 	
	 			Declared inside the class, outside the methods
	 			Accessing the variables done by the object
	 		3.Static variables:		
	 			memory alloted only once in the program
	 			Declared by using static keyword inside the class
	 			Directly access
	 */
	int v1 =20;
	static int v2=12;

	public static void main(String[] args){
		// declaring  variables   Syntax ->  type  variableName = value;
		/*  types of data types
		 *   int - integer -> stores numeric values ( 10 or 8)
		 *   float -> stores float point values (5.6 or -5.6)
		 *   boolean -> stores boolean values (true or false)
		 *   char -> stores characters ('a', 'b','c'...)
		 *   String -> stores text with double codes ("name", "values")
		 */
		
		/* Variables must can starts with letters, digits, underscores, and dollar signs, but not with a white space
		 * myvar, MyVar are different variables because Java is case sensitive.
		 * don't use java keyword i.e., int ,boolean, String...etc
		 * _myvar,$myvar, my123 examples
		 */
		Variables vr =new Variables();
		System.out.println("Instance Variable : "+vr.v1);	// Instance variable by using object

		System.out.println("Staic Varible : "+v2);	// Static variable
		System.out.println("Staic Varible : "+vr.v2);	// Static variable

		int v3=12;
		System.out.println("Local Varible : "+v3);	// local variable
		
		// Below are Local variables
		int a=10;  //type1 declaration -> assigning values direct to the variable
		System.out.println(a);	
		int b;  //type2 declaration -> there is no value assigning to the variable, but we have to assign value this variable otherwise this variable will be treated as invalid one
		b= 5;
		System.out.println(b);
		
		float c =  10.6f;
		System.out.println(c);
		float d;
		d=  5.7F;
		System.out.println(d);
		
		boolean e = true;
		System.out.println(e);
		boolean f;
		f= false;
		System.out.println(f);
		System.identityHashCode(f);
		
		char x = 'i';
		System.out.println(x);
		char y;
		y= 'o';
		System.out.println(y);
		
		String name = "Dinesh";
		System.out.println(name);
		String surname;
		surname= "Karumuri";
		System.out.println(surname);
		System.out.println("     ");

		//we can update the value of any variable
		System.out.println("We can change the value of variables");
		
		b= 66; //int 
		System.out.println(b);
		d= 77.6f;  //float
		System.out.println(d);
		f = true;  //boolean
		System.out.println(f);
		y='u';   // char
		System.out.println(y);
		surname = "K";  //String
		System.out.println(surname);
		System.out.println("     ");

		//we are not able to update the value of any variable while using final keyword
		System.out.println("We can finalize the value of variables");
		
		final int g = 67;
		System.out.println(g);
//		g = 68;
		System.out.println("     ");

		// '+' character is used for concatenation of two string 
		String Name = "Dinesh";
		System.out.println(Name);
		String Surname;
		Surname= "Karumuri";
		System.out.println(Surname);
		String Fullname = Name + Surname;
		System.out.println("Full name is:" + Fullname);
		
		System.out.println("     ");
		// '+' character is used for mathematical operation for integers
		
		int h=10;  
		System.out.println(h);	
		int i;  
		i= 5;
		System.out.println(i);
		int j = h+i;
		System.out.println(j);
		
		// Declaration of many variables
		int k=6, l=5 ,m = 3;
		System.out.println("sum of k,l,m, is :" + k+l+m); // concatenation
		System.out.println(k+l+m);  // addition
		
		int o,p,q;
		o=p=q=56;
		System.out.println("sum of k,l,m, is :" + o+p+q);
		System.out.println(o+p+q);
		
		// Identifiers is nothing but unique names
		int minuitesperHour= 60;
		int min = 60;
		// Both are correct variables, but "minuitesperHour" is  identifier means, it had unique name.
		System.out.println(minuitesperHour);
		System.out.println(min);
		System.out.println();
		
		// Write a program using data types
		String _name_ = "Dinesh";
		System.out.println(_name_);
		char $i = 'K';
		System.out.println($i);
		int height = 167;
		System.out.println(height);
		float weight = 77.8f;
		System.out.println(weight);
		System.out.println("Personal details");
		System.out.println("My name is: "+ _name_+" "+ $i);
		System.out.println("My height is: "+ height);
		System.out.println("My weight is: "+weight);
		System.out.println();
	
	}

}
