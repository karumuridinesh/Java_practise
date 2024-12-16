package com.Practice.Collections;

import java.util.ArrayList;

public class Array_List2 {

	public static void main(String[] args) {
		ArrayList <Integer> list2=new ArrayList();
		list2.add(12);
		list2.add(34);
		list2.add(45);
		list2.add(65);
		list2.add(33);
		list2.add(78);
		System.out.println(list2);
		System.out.println();
		for(int i: list2) {
			System.out.println(i);
		}
		System.out.println();
	}

}
