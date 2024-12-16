package com.Practice.Collections;

import java.util.ArrayList;

public class Array_List {
/*
 Array limitations: 
  		1)fixed size -> Can store few elements only -> to overcome with array list
  		2)can hold the same data type  ->  to overcome the object
 		int []	= new int [];		integer data type array
 Array list:
 		Array list is data structure in java
 		It has no size limits  (can store any number of elements)
 		Can store any kind of data type elements
 		1) Arrary_list list = new Array_List();		can store any kind of data types, any number of elements
 		2) Array_list <Integer> list = new Array_List();		can store any number of elements with integer data type only
           Array_list <String> list = new Array_List();		can store any number of elements with string data type only

 */
	public static void main(String[] args) {
		// Array_List -> can store any kind of elements with any kind of data type
			ArrayList list =new ArrayList();
			// adding elements to array list with any data type
			list.add("This");
			list.add("is");
			list.add("Array");
			list.add("can store");
			list.add(6);
			list.add("elements");
			System.out.println("Lenght of the list is : "+ list.size());
			System.out.println();
			for(Object x:list){
				System.out.print(x+" ");
			}
			System.out.println();
			list.remove(2);
			for(int i=0; i<list.size(); i++){
					System.out.println(list);
			}
			list.add(2,"Array");
			for(int i=0; i<list.size(); i++){
				System.out.println(list);
		}			
			
			System.out.print(list.get(0)+" "+list.get(1)+" "+list.get(0)+" "+list.get(1)+" "+list.get(2)+" "+list.get(3)+" "
					+list.get(4)+" "+list.get(5)+" "+list.get(3)+" "+list.get(4)+" "+list.get(5));
//			This is This is Array can store 5 elements can store 6 elements  
	
	}	

}
