package com.Practice.access_modifiers_;
import com.Practice.access_modifiers.Keyword_protected;


public class Duplicate_class_for_private_keyword extends Keyword_protected {

	public static void main(String[] args) {
		Keyword_protected k= new Keyword_protected();
//		System.out.println(k.x);
//		k.meth();		->  not accesible directly 
		Duplicate_class_for_private_keyword kp= new Duplicate_class_for_private_keyword();
		System.out.println(kp.x);			// accessible by using object for this class only
		kp.meth();
	}

}
