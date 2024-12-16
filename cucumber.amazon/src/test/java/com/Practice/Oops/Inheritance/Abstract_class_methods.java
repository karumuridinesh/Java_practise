package com.Practice.Oops.Inheritance;

/*
 Declaration: int a;  /  for methods -> void m(int a, int b) or void m()
 Definition: int a;(same as declaration for variable)  /  for methods ->void m(int a, int b){ code implementation .System.out.println();... etc  
 Initialization : int a=10; /   it's not for the methods
 
 By using abstract keyword we can create abstract methods & abstract class
 Abstract method: 	->a method have only declaration but not code implementation 
 
 Abstract class: 	->A class at least have on abstract method is called abstract class
 				 An abstract class have both abstract methods and normal methods	
 				 Implementation of abstract method written in the derived class
 				 Object can not be created / instantiated  
 Concrete class:	->class which contains complete definitions for all methods
 		 			Object can be created / instantiated
 
 
 */
// Below is the abstract class 
abstract class Test{
	abstract void m(); 
	
}
abstract class Test1 extends Test{
	void m() {
		System.out.println("this mehtod is overrided from abstract class Test");
	}
	abstract void n();
}
class Test2 extends Test1{
	void n(){
		System.out.println("this is concrete class");
		System.out.println("this method is normal method");
	}
}
 public class Abstract_class_methods {
 

	public static void main(String[] args) {
		
		Test2 T=new Test2();
		T.m();
		System.out.println();
		T.n();
	}

}
