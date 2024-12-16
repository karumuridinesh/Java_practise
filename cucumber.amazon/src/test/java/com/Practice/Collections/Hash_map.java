package com.Practice.Collections;

import java.util.HashMap;
import java.util.Map;

public class Hash_map {

	/*
	 Hash Map:
	  	Employee details:
	  		Keys:			   Values:
	  		Name  --------->    Dinesh
	  		No	  --------->    4835
	  		Salary  ------->    20000
	  		Department  ----->  QA
	Hash map contains Keys and values
	Keys and their values combined as Key Pairs
	While creating hash map we have to specify the Data type of the keys and values must
	In the above example: 
			Name, No, Salary, Department  --> Keys
			Dinesh, 4835, 20000, QA   --> Values
			Name & Dinesh 	--> Key Pair (Entry set)				
			HashMap <String, Integer> hm = new HashMap <String, Integer>();	 Strings as Keys Integers as values

	 */
	public static void main(String[] args) {
		HashMap<String, Object> hm = new HashMap();
		// Adding Key pairs into the hash map
		hm.put("Name", "Dinesh");
		hm.put("ID", 4835);
		hm.put("Salary", 20000);
		hm.put("Departmemnt", "QA");
		System.out.println(hm);
		System.out.println();
		for(Map.Entry<String, Object> x:hm.entrySet()) {
			System.out.println(x.getKey()+" "+ x.getValue());
		}
		
	}

}
