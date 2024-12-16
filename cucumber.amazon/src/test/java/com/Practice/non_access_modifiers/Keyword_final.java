package com.Practice.non_access_modifiers;

class A{
		int a=10;
		final  int b=55;
		
		void m() {
			a=20;						// we can update the value for 'a'
//			b=56;						// we can't update the value for 'b' because final keyword is used while initialization of 'b'
			System.out.println(a+b);
		}
		final void m1() {
			a=33;
//			b=56;						// we can't update the value for 'b' because final keyword is used while initialization of 'b'
			System.out.println(a-b);
		}
	}

class B extends A{
//	void m1() {		// we can't override 'm1' method because final keyword is used while declared 'm1' method in class 'A'
//	
//	}
}

final class C{
	int c=10;
	void n() {
		System.out.println(c);
	}
}

//class D extends C{		//we can't use 'class C' for inheritance because final keyword is used while creating 'class C'
//	
//}

public class Keyword_final {

	public static void main(String[] args) {
		/*
		 Final keyword is used to impose restrictions on variables, methods or classes
		 i) final int a =20;		-> the value of the variables is constant (we can't modify)
		 ii)final void method(){}   -> Method we cannot override in the child class (method overriding is not applicable)
		 ii)final class A{} 		-> We can't extends this class(inheritance is not applicable)
		 */
		A kf =new A();
		kf.m();
		kf.m1();
	}

}
