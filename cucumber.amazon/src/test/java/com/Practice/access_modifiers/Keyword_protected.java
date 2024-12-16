package com.Practice.access_modifiers;

/*
	protected:
	 		Protected variables and methods are accessible within the package and out side of the package through Inheritance only
	 		It should be sub class for the super class
*/
public class Keyword_protected{
	protected int x=19;
	protected void meth() {
		System.out.println(x);
	}
}
