package com.Practice.Oops;

public class  Oops_Object{		// class
	/*
	 Oops -> Object oriented programming language
	 	It is a procedural programming about writing methods that perform operations on the data, 
	 	while object-oriented programming is about creating objects that contain both data and methods.
	 	-> Object
	 	-> Class
	 	-> Abstraction
	 	-> Encapsulation
	 	-> Inheritance
	 	-> Polymorphism
	 	
	 	Object:
	 			An Object is a physical entity and it's a instance of class, which can perform tasks.
	 			Example: Human -> Real entity
	 					 Properties -> Name, Height, Weight, Color
	 			  		 Tasks -> walk(), talk(), read(), write()		 			  
	 	Class:
	 	 		It is a logical entity and it is a collection of variables and methods.
	 	 		It is a blueprint that object follows
	 	 		It has 'n' number of objects
	 	 		Example: Student  -> Logical entity
	 	 				 Properties(variables) -> Roll_no, Name, Section
	 	 				 Tasks -> read(), write(), play() 	
	 	Classes can communicate can't with each other. 
	 	By creating instances(Objects) for the classes, classes can communicate with other
	 	
	 	Class{
	 	Variables
	 	Methods
	 	}	 
	 	By using Object we can use initialize the variables, declare the methods
	 */
		// Variables
		int emp_ID;
		String Emp_Name;
		int salary;
		
		// method -> we need to specify data type while creating the method, then it will return that data type
		void display() {		// void() method returns data type is nothing
			System.out.println(emp_ID);
			System.out.println(salary);
			System.out.println(Emp_Name);
		}
		public static void main(String[] args) {  // Object1
		// We can initialize the value to variables and methods in three ways
			// By using object 
			Oops_Object emp1 = new Oops_Object();
			emp1.emp_ID=2345;
			emp1.Emp_Name="Dinesh";
			emp1.salary= 30000;
			emp1.display();
			
			System.out.println();
			Oops_Object emp2 = new Oops_Object();	// Object2
			emp2.emp_ID=4567;
			emp2.Emp_Name="Pavan";
			emp2.salary=35000;
			emp2.display();
			

			
	}
		
}


