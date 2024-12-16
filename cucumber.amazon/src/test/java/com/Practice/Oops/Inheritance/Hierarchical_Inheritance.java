package com.Practice.Oops.Inheritance;
/*
  Extracting data from one base class_B into derived class_A
  Extracting data from one base class_C into derived class_A
  
 */
class X{
	void m1(){
		System.out.println("m1 method in class X");
	}
}
class Y extends X{
	void m1() {
		System.out.println("m1 method in class Y");
	}
}

class Z extends X{
	void m1() {
		System.out.println("m1 method in class Z");
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Y x= new Y();
		x.m1();
		System.out.println();
		Z z= new Z();
		z.m1();
	}

}
