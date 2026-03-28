package com.anudip.decisionmaking;

import java.util.Scanner;

public class Test03_switch {

	public static void main(String[] args) {

		int choice = 2;

		switch(choice) {
		case 1 :
			System.out.println("you have entered 1");
			break;

		case 2:
			System.out.println("you have entered 2");
			break;

		case 3:
			System.out.println("you have entered 3");
			break;

		}



		//check what is the todays day...

		//used to collect value from end user
		Scanner sc = new Scanner(System.in);
		System.out.println("what is today day????");
		System.out.println("1. Monday");
		System.out.println("2. Monday");
		System.out.println("3. Monday");
		System.out.println("4. Monday");
		System.out.println("5. Friday");
		System.out.println("6. saturdy");
		System.out.println("7. Sunday");

		int choice1 = sc.nextInt();
		switch(choice1) {

		case 1 : 
			System.out.println("Today is monday, very boaring day");
			break;

		case 2: 
			System.out.println("Today is monday, very boaring day");
			break;

		case 7: 
			System.out.println("Today is sunday, enjoy");
			break;

		default:
			System.out.println("Ivalid choice");
		}

	}

}
