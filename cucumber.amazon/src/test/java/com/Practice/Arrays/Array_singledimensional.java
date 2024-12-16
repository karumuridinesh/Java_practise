package com.Practice.Arrays;

public class Array_singledimensional {

	public static void main(String[] args) {
		/* Array -> It is a variable and it contains a set of elements which are in the same data types
		Limitations of Array:
				1.There is a certain limit in the array
				2.We can store same data type elements only
		declaration of Array :
		Syntax:
		Data_type Array_name []= new_keyword Data_type[size of the array];
		
		int A[]=new int[5];		 declaration of Array with 5 integer data type elements
		
		storing elements into the array
		
		A[0]=int data type element1;
		A[1]=int data type element2;
		A[2]=int data type element3;
		A[3]=int data type element4;
		A[4]=int data type element5;
		*/
		int Array[]=new int[5]; // single dimension array  
		// integer data type Array with limit 5 elements
		Array[0]=2;
		Array[1]=3;
		Array[2]=5;
		Array[3]=7;
		Array[4]='d';
		
		for(int i=0;i<5;i++) {
			System.out.println("array element : "+Array[i]);
		}
		/* int i[]=new int[5]; 	->integer array - integers values only
		 * String s[]=new String[5];   -> String array - Strings values only
		 * char c[]=new char[5];   -> character array - characters only
		 */
		System.out.println("");
		int ar[]= {2,3,5,7,11,13,17,'c'};		// integer data type Array without limit
		for(int a:ar) {
			System.out.println(a);
		}
		System.out.println("");
	
	}

}
