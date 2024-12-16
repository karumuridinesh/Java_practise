package com.Practice.access_modifiers;


public class sample {

	public static void main(String[] args) {
		Keyword_protected k =new Keyword_protected();
		System.out.println(k.x);		// Accessible with in the package and class through inheritance
		k.meth();
	}

}
