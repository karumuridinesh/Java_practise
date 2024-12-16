package com.Practice.Oops.Interface;

class A{
	final int a=10;
	final void m() {
//		a=20;					-> not valid because 'a' is final variable
		System.out.println(a);
	}
}
class Test extends A{			
//	void m() {				->  not valid because 'm' is final method in class 'A' 
//	}
}
public class final_keywordse_example {

	public static void main(String[] args) {
	}

}
