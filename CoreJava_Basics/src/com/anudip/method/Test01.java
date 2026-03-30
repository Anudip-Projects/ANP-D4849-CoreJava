package com.anudip.method;

public class Test01 {

	//static method
	//non static method
	
	//predefined method-JVM allready defined-
	public static void main(String[] args) {
		System.out.println("main start");
		//calling to static method
		m1();
		Test01 test = new Test01();
		test.m2();
		System.out.println("main end");
		add(10, 10);
		add1(20,20);
		
	}
	
	//user defined method
	public static void  m1(){
		System.out.println("static method");
	}
	
	public void m2() {
		System.out.println("non static method");
	}
	
	public static void add(int a, int b) {  //paramtez var		
		int result = a+b;
		System.out.println("addition ::" +result);
	}
	
	public static String add1(int a, int b) {  //paramtez var		
		int result = a+b;
		System.out.println("addition ::" +result);
		return "";
	}
}
