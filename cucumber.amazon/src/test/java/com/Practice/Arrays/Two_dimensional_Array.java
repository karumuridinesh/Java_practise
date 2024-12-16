package com.Practice.Arrays;

public class Two_dimensional_Array {

	public static void main(String[] args) {
		/* 		declaration of Two dimensional Array :
		Data_type Array_name[] []= new_keyword data type [size_of_rows][size_of_columns];  
		Array_name[0][0]=data_type element1;
		Array_name[0]01]=data_type element2;
		Array_name[0][2]= data_type element3;
		Array_name[1][0]= data_type element4;
		Array_name[1][1]=data_type element5;
		Array_name[1][2]=data_type element6;
		 */
		int a[][]=new int [3][2]; 	//	[rows][columns]
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=1;j++) {  // for entering rows
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");			// for incrementing the columns for each row
		}
		System.out.println("");			

	// for each loop(enhanced - loop)
		for(int x[]:a) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		int b[][]=new int[2][3];  // [rows] [columns]
		b[0][0]=2;
		b[0][1]=3;
		b[0][2]=7;
		b[1][0]=11;
		b[1][1]=13;
		b[1][2]=17;
		for(int i=0;i<2;i++){   
			for(int j=0;j<3;j++) {   						// for incrementing rows
					System.out.print(b[i][j]+" ");
			}
			System.out.println("");				// for incrementing columns for each row
		}
		System.out.println("");					
		Object c[][]= new Object [3][3];
		c[0][0]=2;
		c[0][1]=5;
		c[0][2]=7;
		c[1][0]=2.4;
		c[1][1]=4.4;
		c[1][2]=8.8;
		c[2][0]='a';
		c[2][1]='b';
		c[2][2]='c';
		for(Object x[]:c) {
			for(Object y:x) {
				System.out.print(y+" ");	
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Two dimensional(3/3) array from Object array");
	Object d[][]= {{15,17,19},{'a','b','c'},{"one","two","three"}};
	for(Object e[]:d){
		for(Object f:e){
			System.out.print(f+" ");
		}System.out.println(" ");
	}
	System.out.println();
	System.out.println("Two dimensional(5/3) array from Object array");
	Object g[][]= {{10,20,30},{40,50,60},{70,80,90},{15,25,35},{45,55,65}};
	for(Object h[]:g) {
		for(Object i:h) {
			System.out.print(i+" ");		
		}
		System.out.println();
	}
	}
	
}
