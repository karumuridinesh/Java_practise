package com.Practice.Oops;

public class Types_of_methods4 {
	int a;
	int b;
	int sum() {
		return (a+b);
	}

	public static void main(String[] args) {
		/*  Method may not returns any value
	   		By using object creation, but we are implementing void methods then which will return no data
		 */
		Types_of_methods4 method4= new Types_of_methods4();
		method4.a=12;
		method4.b=34;
		method4.sum();		// returns nothing  
		int m4 = method4.sum(); // returns integer type only
		System.out.println(m4);
	}

}
