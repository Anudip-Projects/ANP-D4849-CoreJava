package com.anudip.collection;

import java.util.Vector;

public class Test01 {

	public static void main(String[] args) {
		
		
		//limitation of array
		int a[] = {1,2};  //10 	
		
		int a1[] = {}; //20
		//only same type of eleme we can store
		//no predefined method to perform oper on array
		//array has fixed size
		
		//solution is =>  CF clases
		
		//vector
		//ArrayList
		//linkedList
		//statck
		
		Vector<Object> v = new Vector<Object>();
		v.add(10);
		v.add("Raja");
		v.add(true);
		v.add(4.5f);
		System.out.println(v);
		
		Vector<Integer> v1 = new Vector<Integer>();
		v.add(10);
		
		//8 types pD
		//8 wrapper class
		//int  -> Integer
		//float -> Float
		//char -> Char
		
		int a11 = 22;
		
		Integer i = a11;  //autoboxing
		System.out.println(i);  //22
		
		int a12 = new Integer(i);   //unboxing
		System.out.println(a12);
		
		
		
	}
}
