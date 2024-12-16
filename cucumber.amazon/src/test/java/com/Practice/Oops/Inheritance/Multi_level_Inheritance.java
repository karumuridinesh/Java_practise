package com.Practice.Oops.Inheritance;
class C{
	int a;
	int b;
	public void percentile() {
		System.out.println(a%b);
	}
}
class D extends C{
	int c;
	int d;
	public void modulus() {
		System.out.println(c/d);
	}
}
class E extends D{
	int e;
	int f;
	void Substraction() {
		System.out.println(f-e);
	}
}
public class Multi_level_Inheritance {

	public static void main(String[] args) {
		// Multi level Inheritance ->  creating object for class_E, get direct access to use class_D and class_C
		System.out.println("Below are class E related variables and methods");
		E k=new E();
		k.e=22;
		k.f=43;
		System.out.println(k.e);
		System.out.println(k.f);
		k.Substraction();
		System.out.println();
		System.out.println("Below are class D related variables and methods");
		k.c=25;
		k.d=34;
		System.out.println(k.c);
		System.out.println(k.d);
		k.modulus();
		System.out.println();
		System.out.println("Below are class C related variables and methods");
		k.a=36;
		k.b=6;
		System.out.println(k.a);
		System.out.println(k.b);
		k.percentile();
	}

}
