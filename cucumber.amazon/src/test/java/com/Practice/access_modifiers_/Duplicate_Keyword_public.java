package com.Practice.access_modifiers_;

import com.Practice.access_modifiers.Keyword_public;

public class Duplicate_Keyword_public {

	public static void main(String[] args) {
		Keyword_public key =new Keyword_public();
		System.out.println(key.x);			// accessible by using object only
		key.metho();						// accessible by using object only

	}

}
