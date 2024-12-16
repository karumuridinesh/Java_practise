package com.Practice.Loops;

public class For_loop {

	public static void main(String[] args) {
		
		
		/* for loop
		  Syntax:
		  for (Initialization; condition; increment/decrement) {
		  system.out.println("for loop statement");
		  }	  
		 */
		for (int a=1;a<=10;a++) {
			System.out.println("Number is: "+ a);
		}
		System.out.println("");
		System.out.println("for loop executed");
		
		/* Break Keyword
		Syntax:
			for(Initialization;condition;increment/decrement){
			if(condition){
				break;
				}
			system.out.println("for loop statement");
			}
		*/
		for(int x=1;x<=10;x++) {
			if(x%2==0) {
				break;
			}
			System.out.println(x+" is odd number");
		}
		System.out.println("");
		
		/*Continue Keyword
		 Syntax:
		 for(Initialization;Condition;increment/decrement){
		 	if(condition){
		 	continue;
		 	}
		 	system.out.println("for loop statement");
		 } 
		 */
		for(int y=1;y<=10;y++) {
			if(y%2==0){
				continue;
				}
			System.out.println(y+" is odd number");
		}

	}

}
