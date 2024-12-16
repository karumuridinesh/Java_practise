package com.Practice.Oops;

public class Types_of_methods2 {
	/*  A method may take parameters
 		By implementing method overloading, we can take parameters and we can retrieve data from the class
	 */
	int a;
	int b;
	String name;
	void sum(int x, int y) {
		x=a;
		y=b;
	System.out.println(x+y);
	}
	public static void main(String[] args) {
		Types_of_methods2 method2 = new Types_of_methods2();
		method2.sum(10,20);

	}

}
