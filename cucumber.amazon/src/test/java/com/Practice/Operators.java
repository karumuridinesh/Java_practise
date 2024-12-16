package com.Practice;

public class Operators {

	public static void main(String[] args) {
		/* Operator is used for performing operations on two values or more operands
		1. Arithmetic Operators
		2. Relational/ Comparison Operators
		3. Logical/ Bitwise Operators
		4. Assignment Operators
		5. Increment Operators
		6. Decrement Operators
		*/
		int a = 10;
		int b = 20;
		System.out.println("Arithmetic Operators");  // It returns values
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);
		System.out.println("");
		System.out.println("Relational/Comparison operators"); // mostly used for numeric values & Returns Boolean values like TRUE/FALSE
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println("");
		boolean x = true;
		boolean y = false;
		System.out.println("Logical operators");  
/*		Logical operators are designed for use with boolean values and support short-circuiting &Returns Boolean values like TRUE/FALSE
		&&: Short-circuits if the first condition is false, i.e., it doesn't evaluate the second condition.	
		&& → Logical AND
		|| → Logical OR
		! → Logical NOT
		*/
		System.out.println(x&&y);
		System.out.println(a|b);			
		System.out.println(x||y);          
		System.out.println("");
		System.out.println(!x);
		System.out.println(!y);
		System.out.println("Bitwise operators");
/*		Bitwise operators are primarily used for bit-level operations on integers but can also handle boolean values without short-circuiting & Returns Boolean values like TRUE/FALSE
		&: Performs logical AND without skipping any conditions, even if the first condition is false.
		& → Bitwise AND
		| → Bitwise OR
		^ → Bitwise XOR
		~ → Bitwise NOT (only for integers)
		<< → Left shift
		>> → Signed right shift / Right shift
		>>> → Unsigned right shift
*/				
		System.out.println(x&y);
		System.out.println(a&b);		//  00001010 &  00010100 ->  no positions where both a and b have 1, so result 0
		System.out.println(x|y);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(~b);
		System.out.println(1<<a);
		System.out.println(2<<a);
		System.out.println(a>>2);
		System.out.println(a>>1);
		System.out.println(a>>>1);
		System.out.println(a>>>2);
		System.out.println("");
		System.out.println("Assignment operators");  // Assigns a values to the variable with some operation
		System.out.println(a);
		System.out.println(b);
		b=a;
		System.out.println(b);
		int c=+1;
		System.out.println(c);
		int d =-5;
		System.out.println(d);
		int e= c*2;
		System.out.println(e);
		int f = e/2;
		System.out.println(f);	
		System.out.println("");
		System.out.println("Increment operators"); // returns the increased value form the actual value
		int k = 19;
		System.out.println(k);
		k=k++;   // didn't perform any action and used for increment value in iterations for the loops
		System.out.println(k); 
		k=++k;
		System.out.println(k);
		k+=3;
		System.out.println(k);
		System.out.println("");
		System.out.println("Decrement operators");	// returns the decreased value from the actual value
		int l = 13;
		System.out.println(l);
		l=l--;		// didn't perform any action and used for decrement value in iterations for the loops
		System.out.println(l);
		l=--l;
		System.out.println(l);
		l-=2;
		System.out.println(l);
	}

}
