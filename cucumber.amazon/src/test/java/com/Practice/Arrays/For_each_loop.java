package com.Practice.Arrays;

public class For_each_loop {

	public static void main(String[] args) {
		/* for each loop(Enhanced for loop) -> It is used for Array declarations
		 Syntax:
		 for(Initialization; declaration){
		 System.out.println("for each loop statement");
		 }		 
		 */
		int a[]=new int[5];
		System.out.println(a.length);	// returns length of the array -> its return type is string 
		System.out.println("");
		a[0]=2;
		a[1]=3;
		a[2]=5;
		a[3]=7;
		a[4]=11;
		for(int i:a){
			System.out.println("Array element :"+ i);
		}
		String A[]=new String[3];
		System.out.println(a.length);	// returns length of the array -> its return type is string 
		System.out.println("");
		
		A[0]="Welcome";
		A[1]="to";
		A[2]="home";
		
		for(String s:A) {
			System.out.println("String element :"+s);
		}	
		System.out.println("");
		
		// sum of the array 
		int y = 0;
		for(int x:a) {
			y=y+x;
		}System.out.println("Sum of the arrray elements is :"+y);
		
	}

}
