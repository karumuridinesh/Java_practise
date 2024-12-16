package com.Practice.Oops;

public class Oops_method {
	float height;
	String Patient_name;
	float  weight;
	String Disease;
	
	void Patient_details(String name,String disease,float wt ,float ht) {
		Patient_name=name;
		Disease=disease;
		weight=wt;
		height=ht;	
	}
	void checkup() {
		System.out.println(height);
		System.out.println(Patient_name);
		System.out.println(weight);
		System.out.println(Disease);
	}
	
	public static void main(String[] args) {
		/*  We can initialize the value to variables and methods by using method
		 	Method overloading -> class name and Method name should not be the same, then we can create object for the class 
			and pass the parameters directly to the method by using the object. 
		*/
		Oops_method pt1 =new Oops_method();
		pt1.Patient_details("Mukesh", "Sugar", 76.8f, 178.F);
		pt1.checkup();
		System.out.println();
		Oops_method pt2 = new Oops_method();
		pt2.Patient_details("Ramesh","Blood Pressure",89.4f,160.1F);
		pt2.checkup();
	}

}
