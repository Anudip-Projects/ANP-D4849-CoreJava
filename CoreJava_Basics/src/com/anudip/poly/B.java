package com.anudip.poly;

public class B extends A{

	
	//method overridng
	static void add(int a, int b, int c) {
		System.out.println("addition  B::" +(a+b+c));
	}
	
	
	public static void main(String[] args) {
		
		add(10,10);
		add(10,10,10);
		
		A.add(10,20,30);
	}
}
