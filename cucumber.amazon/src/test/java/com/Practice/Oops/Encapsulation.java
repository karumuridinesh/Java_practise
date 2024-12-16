package com.Practice.Oops;

public class Encapsulation {
	/*
	 Encapsulation: Binding variables and methods together 
	 Example: class and Object are working with encapsulation
	 	class emp {
	 	Variables
	 	int emp_id;
	 	int emp_name;
	 	int salary;
		
		methods
		talk();
		work();
		}
		
		Object: 
			class em = new emp();
			Variables 
			em.emp_id=234;
			em.emp_name="sonu";
			em.salary=45000;
			
			methods
			em.talk();
			em.work();
	 */
	// Variables
	int id;
	int sal;
	String name;
	
	//methods
	void employee_sal() {
		System.out.println(id+" is having salary : "+sal);
	}
	void employee_name() {
		System.out.println(id+" is having name : "+name);
	}
	
	public static void main(String[] args) {
		
		// Object  -> In the object also we combining variables and methods
		Encapsulation emp = new Encapsulation();
		emp.id=6677;
		emp.sal=34000;
		emp.name="Ramu";
		
		emp.employee_name();
		System.out.println();
		emp.employee_sal();
		
	}

}
