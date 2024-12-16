package com.Practice.access_modifiers;

public class Keyword_public {
	/*
	 public:	public variables and methods can accessible within the package and out side the package directly
	 */
	public int x= 23;
	public void metho() {
		System.out.println("public variable : "+x);
	}
	public static void main(String[] args) {
//		System.out.println(x);			-> not accessible 
//		metho();						-> not accessible
		Keyword_public ke =new Keyword_public();		
		System.out.println(ke.x);		//  accessible by using object only
		ke.metho();						// accessible by using object only
		
		}	

}
