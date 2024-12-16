package com.Practice.Oops;

public class Method_overloading {
	/*	1.Method overloading/compile time polymorphism:-> Overloaded methods
	Method overloading occurs when two or more methods in the same class have the same name but different parameter lists (number or types of parameters).
	The compiler determines which method to call based on the arguments passed during compilation, hence achieving compile-time polymorphism
     1.Number of parameters should be different
	 2.Order of the parameters are should be different
	 3.Data types of parameters are should be different		*/	

    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }

	public static void main(String[] args) {

		Method_overloading calc = new Method_overloading();
        System.out.println(calc.add(5, 10));       // Calls add(int, int)
        System.out.println(calc.add(5.5, 10.5));  // Calls add(double, double)
    
	}
}
