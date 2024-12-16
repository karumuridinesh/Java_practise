package com.Practice.Oops.Interface;
/*For achieving multiple inheritance 
  we are using two keywords:
  							1)Interface
  							2)Implements
  							
 1)Interface: It is a blue print of class
 Syntax: 
 Interface Test{
 variables
 methods
 }
 
 i)Extracting data from Interface to class -> implements
 ii)Extracting data from class to class -> extends
 iii)Extracting data from  interface to interface -> extends
 
 2)Interface can contains static and final variables and abstract methods
 3)In interface by default methods are public, those accessed in everywhere
 4)In interface ,
 */
interface TestA{
	void display();
}

class TestB implements TestA{
	public void display() {
		System.out.println("Extracting data fromthe interface");
	}
}

interface TestC{
	void display();
	void show();
}
interface TestD{
	void display();
	void show();
}
class TestE implements TestC,TestD{
	public void display() {
		System.out.println("Showing TestA properties");
	}
	public void show() {
		System.out.println("Showing TestB properties");
	}
}
public class Multiple_Inheritance {
	
	public static void main(String [] args) {
		TestB obj =new TestB();
		obj.display();
		System.out.println();
		TestE ob =new TestE();
		ob.display();
		ob.show();
	}
}
