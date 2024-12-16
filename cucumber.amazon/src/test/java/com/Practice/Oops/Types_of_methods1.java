package com.Practice.Oops;

public class Types_of_methods1{
	/* A method may not take any parameters 
	 By creating Object, we can declares values for variables & retrieve data(methods) by creating object for the class*/
	int a;
	int b;
	void sum(){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Types_of_methods1 method1 =  new Types_of_methods1();
		method1.a=12;
		method1.b=23;
		method1.sum();
	}

}

