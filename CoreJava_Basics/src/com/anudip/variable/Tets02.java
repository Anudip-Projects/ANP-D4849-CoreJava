package com.anudip.variable;

public class Tets02 {

	public static void main(String[] args) {
	
		System.out.println("static var from Test03 class ::" +Test03.a);
		System.out.println("static var a"  +Test01.a);
		
		Test01 test = new Test01();		
		System.out.println("non static var a"  +test.b);
		System.out.println(test.a);
	}
}
