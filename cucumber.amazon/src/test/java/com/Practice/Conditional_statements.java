package com.Practice;

public class Conditional_statements {

	public static void main(String[] args) {
		// Conditional statement
		//1. If statement
		//2. If-else statement
		//3. Nested if-else statement
		//4. Switch-else statement
		
		/* if conditional statement
		Syntax:
		if (condition)  {
			System.out.println("if statement");
		}*/
		int a = 10;
		if(a>=5) {
			System.out.println("if condition:");
			System.out.println("Given number is bigger than 5");
			System.out.println("");
		}
		
		/* if-elese conditional statement
		 * Syntax:
		 if (condition){
			 System.out.println("if statement");
			 }
		 else {
 			System.out.println("else statement");
		 } 
		 */
		if (a>15) {
			System.out.println("if-else condition:");
			System.out.println("Given number is biggger than 15");
			System.out.println("");
		}
		else {
			System.out.println("if-else condition:");
			System.out.println("Given number is smaller than 15");
			System.out.println("");
		}
		/*Nested if-else statement
		 * Syntax:
		 * if(condition){
		  	 	System.out.println("if statement");
			 	}
		   else-if{
 				System.out.println("else-if statement");
		 		}
		   else-if{
 				System.out.println("else-if statement");
		 		}
		   else {
 			System.out.println("else statement");
		 		} 
		 */
		int day =3;
		if(day==1) {
			System.out.println("Sunday");
		}
		else if(day==2) {
			System.out.println("Monday");
		}
		else if(day==3) {
			System.out.println("Tuesday");
		}else if(day==4) {
				System.out.println("Wednseday");
		}else if(day==5) {
			System.out.println("Thursday");
		}else if(day==6) {
			System.out.println("Friday");
		}else if(day==7) {
			System.out.println("Saturday");
		}
		System.out.println("");
		/*Switch-else statement
		 Syntax:
		 switch(Variable)
		 {
		 Case Condition1: System.out.println("statement1")
		 break;
		 Case Condition2: System.out.println("statement2")
		 break;
		 Case Condition3: System.out.println("statement3")
		 break;
		 Case Condition4: System.out.println("statement4")
		 break;
		 default: System.out.println("default statement")
		 
		 */
		int weekday=3;
		switch(weekday){
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3: System.out.println("Tuesday");
		break;
		case 4: System.out.println("Wednsday");
		break;
		case 5: System.out.println("Thursday");
		break;
		case 6: System.out.println("Firday");
		break;
		default : System.out.println("Saturday");
		}
		
	
	}

}
