package com.Practice.access_modifiers;
/*
 Collection of classes is called "package"
 User defined packages -> user can create packages
 Built-in packages -> using import function
 */

/*
private:
	we cannot access the variable & method which is private
	we can access within the class only (outside of the class is not accessible)
*/

class A{
	private int a=10;
	private void m() {
		System.out.println("private keyword");
	}
}
public class Keyword_Private {

	public static void main(String[] args) {
		A obj =new A();
//		System.out.println(obj.a);	-> not accessible since it is private
//		obj.m();					-> not accessible this method is private
	}
}
