package com.Practice;

import java.util.Scanner;

public class Programs {

	public static void main(String[] args) {
		// Swapping of two numbers
		int a = 10;
		int b = 20;
		System.out.println("Before swapping a value is :" + a);
		System.out.println("Before swapping b value is :" + b);
		int  c;
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping a value is :" +a);
		System.out.println("After swapping b value is :" +b);
		
		System.out.println("");
		
		// to find given is even or odd
		int x=14;
		System.out.println("");
		if (x%2==0) {
			System.out.println(x+" is even number");
		}else {
			System.out.println(x+" is odd number");
		}
		
		// find biggest number of three numbers
		int k= 142;
		int l= 3;
		int m= 60;
		System.out.println("");
		if (k>l){
			if(k>m) {
				System.out.println(k+" is biggest number");				
			}
		}else if (l>m) {
			if(l>k) {
				System.out.println(l+" is biggest number");
			}
		}else {
			System.out.println(m+" is biggest number");
		}
		
		// to find a month name with number by using switch condition
		int month=11;
		System.out.println("");
		switch(month){
		case 1:System.out.println("January");
			break;
		case 2: System.out.println("February");
			break;
		case 3: System.out.println("March");
			break;
		case 4: System.out.println("April");
			break;
		case 5: System.out.println("May");
			break;
		case 6: System.out.println("June");
			break;
		case 7: System.out.println("July");
			break;
		case 8: System.out.println("August");
		 	break;
		case 9: System.out.println("September");
			break;
		case 10: System.out.println("October");
			break;
		case 11: System.out.println("November");
			break;
		default : System.out.println("December");		
		}		
		Scanner sc=	new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		// print-> print statement in the same line(current line) & println-> print statement in the next line
		
		String Age = sc.nextLine();
		System.out.print("Sam Age is :"+ Age );
		System.out.println("Sam Age is :"+ Age );

	}

}
