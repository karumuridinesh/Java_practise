package com.Practice.Loops;

public class Do_while_loop {

	public static void main(String[] args) {
		/*	do while loop
		 Syntax:
		 do{
			 System.out.println("do statement");			 
		 } while(condition);
		*/
		int a = 3;
		do {
			System.out.println("Given number is: "+ a);
			a++;
		}while(a<10);
		System.out.println("");
		System.out.println("do while loop executed");
	}

}
