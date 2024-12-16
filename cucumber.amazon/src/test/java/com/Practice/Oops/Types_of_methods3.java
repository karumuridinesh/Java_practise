package com.Practice.Oops;

public class Types_of_methods3 {
	/* Method may returns some value
	   By using object creation, but we are implementing non-void methods (specific data type methods) then
	   which will return the same data type value only
	 */
	int a;
	int b;
	float c;
	float d;
	 int sum() {
		 return (a+b);   // we have to use return keyword while using specific data type methods
	 }
	 float total (){
		 return (c+d);
	 }
	public static void main(String[] args) {
		Types_of_methods3 method3 =new Types_of_methods3();
		method3.a=12;
		method3.b=24;
		method3.c=3.2f;
		method3.d=4.6F;
		
		method3.sum();
		method3.total();
		int m3 = method3.sum();
		System.out.println(m3);
		
		System.out.println();
		
		float m4 = method3.total();
		method3.sum();
		method3.total();
		System.out.println(m4);


			
	}

}
