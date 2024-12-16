package com.Practice.Oops;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Bank{
	int getrateofinterest() {
		return 0;
	}
	
}
class SBI extends Bank{
	int getrateofinterest() {
		return 10;
	}
}
class ICICI extends SBI{
	int getrateofinterest() {
		return 12;
	}
}
class Axis extends ICICI{
	int getrateofinterest() {
		return 15;
	}
}

class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}
class Bike extends Vehicle{
	void run() {
		System.out.println("Bike is moving");
	}
}
public class Method_overriding {
	/*
	2.Method overriding/runtime polymorphism: ->
		Re-define the same method from parent class to child class
		DEfintion should be same but body can be changed
	  Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its parent class.
The method in the subclass must have the same signature (name, return type, and parameters) as the one in the parent class.
How it works:
The decision of which method to execute is made at runtime based on the object being referenced, achieving runtime polymorphism.
*/

	public static void main(String[] args) {
//      Method overriding
	        Animal myAnimal = new Dog(); // Parent reference, child object
	        myAnimal.sound();           // Calls Dog's sound method (runtime decision)
	        System.out.println();

	        Bank Bk =new SBI();
	        System.out.println("SBI Bank ROI is : " +Bk.getrateofinterest());
	        
	        Bank Bk1 =new Axis();
	        System.out.println("Axis Bank ROI is : " + Bk1.getrateofinterest());
	        
	        Bank Bk2 =new ICICI();
	        System.out.println("ICICI Bank ROI is : " + Bk2.getrateofinterest());
	        System.out.println();
	        
	        Vehicle vh=new Bike();
	        vh.run();
	        
	        Vehicle vh1=new Vehicle();
	        vh1.run();
	}

}
