package com.Practice.Oops;

public class Keyword_this {
	/*
		Used to call instance variables with same name
	 	this -> It represents instance variables of the object
	 */

		int a=12;
	void m (){ 
		int a=20;
		System.out.println("Local vairable : "+a);		
		System.out.println("Instance variable : "+this.a);
	}
	public static void main(String[] args) {
		Keyword_this ky = new Keyword_this();
		ky.m();
	}

}
