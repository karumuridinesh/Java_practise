package com.Practice.Oops;

public class Constructor {
	/*  We can initialize the value to variables and methods by using constructor*
	 Constructor -> class name and Method name should be same, then we can create constructor for that method
	 
	 Constructor overloading -> a class contains more than one constructor, with different parameters 
	 1.It's a special kind of method
	 2.Constructor name should be same as class name
	 3.It has not return type, so it will not return any value
	 4.It will take parameters
	 5.It is used for the initialize the values at the time of the object creation
	 6.No need to call the constructor explicitly (It will be invoked at the time of the object creation
	 
	 Types of constructors:
	 		1.Default constructor
	 		2.Parameterized constructor
	  */
	int roll_num;
	String student_name;
	char section;
	int Class_standard;

	Constructor(){
		String student_name = "dany";
		int roll_num = 23;
		System.out.println(student_name+" roll number is : "+ roll_num);
	}

	Constructor(int num, String name, char sec, int Class) {
		roll_num=num;
		student_name=name;
		section=sec;
		Class_standard=Class;
	}
	
	void display() {
		System.out.println(roll_num);
		System.out.println(student_name);
		System.out.println(section);
		System.out.println(Class_standard);
	}

	public static void main(String[] args) {
// 		creating Default constructor
 		Constructor na = new Constructor();		
		System.out.println();
//		 creating Parameterized constructor
		Constructor Dinesh = new Constructor(121,"Dinesh",'A',8);
		Dinesh.display();
		System.out.println();
	}


}
