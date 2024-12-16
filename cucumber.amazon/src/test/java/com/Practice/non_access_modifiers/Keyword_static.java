package com.Practice.non_access_modifiers;

public class Keyword_static {

		/*
		 Static Keyword:	Before creating variables & methods we use static keyword then those are called static variables& methods
		  Example:
		  	static int a;
		  	static int m(){
		  	System.out.println();
		  	}
		  	There are static variables & methods 
		  			  non-static variables & methods
		  i)static variables & methods are shared across the objects
		  ii) static variables & methods can directly accessed through class name
		  static methods can access directly to static related variables and methods
		  static methods can also access non-static related data through object only
		  non-static data can access by everything directly
		 */
		int a;		// non-static variable
		static int b;	// static variable 
		
		
		static void m1() {									// static method
			System.out.println("Static variable : "+b);
		}
		void m2(){											// non-static method
		System.out.println("Non-static variable : "+a);	
		}
		void m3() {
			a=10;
			b=0;
			m1();
			m2();
		}
		static class Test {
			static String s="welcome";
		}
//		class System{
//			static PrintStream out =null;
//		}	
//		System.out.println();
//		class.staticvariable.method in PrintStream class in Java
		
		public static void main(String[] args) {
			b=22;
			System.out.println(b);
			m1();
//			m3();					-> 	not accessible	-> this method has static related data(we have to create object)
//			a=44;					->  not accessible  -> it is non-static variable(instance variable)
//			System.out.println(a);	-> 	not accessible
//			m2();					-> 	not accessible	-> this method has static related data(we have to create object)
			Keyword_static Ks =new Keyword_static();
			Ks.a=33;					//	->  accessible  -> by using object we can access instance variables
			System.out.println(Ks.a);	//	->  accessible  -> by using object we can access instance variables
			Ks.m2();					//	->  accessible  -> by using object we can access non-static method(instance variable) related data
			Ks.m3();
			
			System.out.println();
			System.out.println(Test.s.length());
//								class.static variable.String method
			
		}

}
