package com.anudip.construct;

public class Test01 {

	//constru is special type of method which is defined in class
	//name same
	//AM
	//there is no RT
	//3 types
	//if u put any type of constru in class, comiper will not generate the const
	
	public Test01() {
		System.out.println("non-param constr");
	}
	
	public Test01(int a) {
		System.out.println("param constr");
	}
	public Test01(int a,int v) {
		System.out.println("param constr");
	}
	public static void main(String[] args) {
		
		Test01 test = new Test01();
		Test01 test1 = new Test01(10);
		
		
		Test02 test3 = new Test02();
	}

}
