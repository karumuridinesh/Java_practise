package com.Practice;

public class Topic_String {

	public static void main(java.lang.String[] args) {
		/* 
		 Syntax:	
		 		Data_type variable_name = collection of letter with in the double codes
		 String s = "Welcome";
		 
		 String methods():
		 length(); -> Number of characters in the string
		 concat(); -> Joining/Combining two (or) more strings
		 equals(); -> Comparing two strings
		 equalsignorecase(); -> Comparing two strings and ignore about the case sensitive
		 contains(); -> Checking the sub string in the main string
		 substring(); -> Returns substring from the main string
		 replace(); -> replacing one string to another string (or) one letter to another letter in the string
		 */
		String s1 = "automation ";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println();
		//concatenation
		String s2= "script";
		String s = s1+s2;
		System.out.println(s);
		System.out.println();
		String s3 = "script";
		String s4 = "SCRIPT";
		System.out.println(s3.equals(s2));
		System.out.println(s4.equals(s2));
		System.out.println();
		System.out.println(s4.equalsIgnoreCase(s2));
		System.out.println();
		CharSequence s5 = "auto";
		System.out.println(s1.contains(s5));
		System.out.println(s1.substring(4, 11));
		System.out.println(s1.replace('o', 'p'));
		
		
		
		
	
		
		
	}

}
