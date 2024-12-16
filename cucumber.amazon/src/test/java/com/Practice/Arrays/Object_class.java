package com.Practice.Arrays;

public class Object_class {

	public static void main(String[] args) {
		/* In the Object we can store different data type values
		   int a;
		   boolean b;
		   char c;
		   String s;
		   float f;		  
		 */
		Object o;
		o= 12;
		o='a';
		o=3.2F;
		o="object";
		o=true;
		System.out.println(o);
		System.out.println("");
		Object obj[]=new Object[5];		// object with limit 5
		obj[0]= 19;
		obj[1]= 'o';
		obj[2]= 3.2F;
		obj[3]= false;
		obj[4]= "array object";
		
		for(Object s: obj) {
			System.out.println(s);
		}
		System.out.println("");
		// to get specific all data types 
		Object oc[]= {2,6.4,false,'y',"curly",true};  // Object array without limit 
		for(Object a:oc) {
			System.out.println(a);
		}
		System.out.println("");

		//to get specific data types only		
		Object c[]= {2,5,2.1f,5.3f,3.1,6.4,true,false,'y','x',"curly","bean"};   
			for(Object x:c) {
				if(x instanceof Integer){
					System.out.println("Integer : "+x);
					}
				}
			System.out.println("");		
			for(Object x:c) {
				if(x instanceof Float) {
					System.out.println("Float : "+x);
				}
			}
			System.out.println("");		
			for(Object x:c) {
				if(x instanceof Double) {
					System.out.println("Double : "+x);
				}
			}
			System.out.println("");		
			for(Object x:c) {
				if(x instanceof Boolean) {
					System.out.println("Boolean : "+x);	
				}
			}
			System.out.println("");		
			for(Object x:c) {
				if(x instanceof Character) {
					System.out.println("Char : "+x);
				}
			}
			System.out.println("");		
			for(Object x:c) {
				if(x instanceof String) {
					System.out.println("Sting : "+x);
				}
			}
		System.out.println("");	
		
		//to get specific data types into two dimensional array		
			for(Object x:c) {
				if(x instanceof Integer){
					System.out.print(x+" ");
					}
			}	
			System.out.println("");		
			for(Object x:c) {
				if(x instanceof Float) {
					System.out.print(x+" ");
				}
			}
			System.out.println("");		
			for(Object x:c) {
				if(x instanceof Double) {
					System.out.print(x+" ");
				}
			}
			System.out.println("");		
			for(Object x:c) {
				if(x instanceof Boolean) {
					System.out.print(x+" ");
				}
			}
			System.out.println("");		
			for(Object x:c) {
				if(x instanceof Character) {
					System.out.print(x+" ");
				}
			}
			System.out.println("");		
			for(Object x:c) {
				if(x instanceof String) {
					System.out.print(x+" ");
				}
			}
		System.out.println("");	
	}

}
