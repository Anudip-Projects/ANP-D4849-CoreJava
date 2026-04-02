package com.anudip.interfaceccc;

public class Circle implements Shape {

	int radius = 5;
	
	@Override
	public void findArea() {
		System.out.println("Area of Circle :: "+(3.14*(radius*radius)));
	}

}
