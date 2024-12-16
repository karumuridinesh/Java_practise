package com.Practice.Oops;

public class Constructor_overloading {
	/*
	 Constructor overloading:
		1.Number of parameters should be different
		2.Order of the parameters are should be different
		3.Data types of parameters are should be different	
	 */
	int roll_num;
	String Name;
	String Project;
	
	Constructor_overloading(){
		int x =419; 
		String nam="Dinesh";
		String pro="Embedded Systems";
		System.out.println(nam+" is doing project: "+pro);
	}
	Constructor_overloading(int roll_num,String Name){
		System.out.println(Name+" roll number is : "+roll_num);		
	}
	Constructor_overloading(int roll_num, String Name, String Project){
		System.out.println(Name+" roll number is : "+roll_num);
		System.out.println(Name+" is doing Project : "+Project);
	}
	public static void main(String[] args) {
		Constructor_overloading co=new Constructor_overloading();
		System.out.println();
		Constructor_overloading con = new Constructor_overloading();
		System.out.println();
		Constructor_overloading cons = new Constructor_overloading(143,"Darling");
		System.out.println();
		Constructor_overloading constr = new Constructor_overloading(649,"Romeo");
		System.out.println();
		Constructor_overloading constru=new Constructor_overloading(346,"Babe","Exploring");
		constru.roll_num=234;
		System.out.println();
		Constructor_overloading construc=new Constructor_overloading(234,"Babe","Flirting");
	}

}
