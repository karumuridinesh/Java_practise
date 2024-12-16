package com.Practice.access_modifiers;

public class Keyword_default {
/*
 default:	-> If we don't specify any any keyword then it will treated as called default type
 Example: 	int a;		-> default variable
 			void m();	-> default method
 	Accessible with in the package only
 	Outside of the package not accessible
 */
	int i=10;		// default 
	void m() {		// default
		System.out.println(i);
	}
	public static void main(String[] args) {
		Keyword_default kd =new Keyword_default();
		System.out.println(kd.i);
		kd.m();
		
		
	}

}
