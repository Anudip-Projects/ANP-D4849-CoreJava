package com.anudip.inheri.hasA;

public class MyOpearationMain {

	public static void main(String[] args) {
		
		Address add = new Address("MH","888999","Mumbai");
		
		Student stud = new Student("Raja", 101, 21,add);
		System.out.println(stud);
		
		Bike bike = new Bike("Gray", "Royal Infield");
		stud.goingToCollege(bike);
		
	}
}
