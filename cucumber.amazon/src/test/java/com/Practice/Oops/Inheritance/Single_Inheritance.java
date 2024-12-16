package com.Practice.Oops.Inheritance;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
Single Inheritance -> Acquiring data(variables and methods) from Parent class to child class
Example:  class B extends class_A
*/

class A{
	int a=10;
	int b=20;
	
	void multiplication() {
		System.out.println(a*b);
		}
	}
	class B extends A{
		int x=11;
		int y=22;
		void addition() {
			System.out.println(x+y);
		}
	}
public class Single_Inheritance {
	public static void main(String[] args) {
		// Single inheritance -> creates object for class B and acquiring data from class B and class A
		B obj = new B();
		System.out.println("Below are class B related variables and methods");
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.addition();
		System.out.println();
		System.out.println("Below are class A related variables and methods");
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.multiplication();
		System.out.println();
		//Without Inheritance -> creating object for class A and get direct access for class A
		A ob =new A();
		System.out.println("Below are class A related variables and methods");
		System.out.println(ob.a);
		System.out.println(ob.b);
		ob.multiplication();
		
	}

}
