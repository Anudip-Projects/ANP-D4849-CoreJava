package com.anudip.loops;

public class Test01_forLoop {

	public static void main(String[] args) {

		//for loop
		for(int i = 0 ; i<=10 ; i++) {  //11<=10
			System.out.println("i value ::" +i);
		}
		System.out.println("outside the loop");


		System.out.println("===========while loop=======");
		//while loop
		//declaration
		int j = 11;

		while(j<=20) {
			System.out.println("j value ::" +j);
			//increment op
			j++;  //2
		}

		System.out.println("===========do while loop=======");
		//do while

		//intialz
		int k = 100;
		do {
			System.out.println("k value ::" +k);
			k++;
		}while(k<=110);

		System.out.println("===================================");
		//for loop
		for(int i = 0 ; i<=10 ; i++) {  //11<=10
			System.out.print("*");
		}
		
		
		
		System.out.println("============nested for loop=======================");
		//for loop
		for(int i = 1 ; i<=10 ; i++) {  //11<=10
			
			for(int l = 1 ; l<=10 ; l++) {  //11<=10
				System.out.println("I and J value :: " +i+  "   " +l);
			}
			
		}
		

		System.out.println("============nested for loop=======================");
		//for loop
		for(int i = 1 ; i<=5 ; i++) {  //11<=10    //1 2 3
			
			for(int l = 1 ; l<5 ; l++) {  //11<=10   //1 2 3
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("============nested for loop=======================");
		//for loop
		for(int i = 1 ; i<=5 ; i++) {  //11<=10    //1 2 3
			
			for(int l = 1 ; l<=i ; l++) {  //11<=10   //1 2 3
				System.out.print("*");
			}
			
			System.out.println();
		}

		
		
		System.out.println("============nested for loop=======================");
		//for loop
		for(int i = 1 ; i<=5 ; i++) {  //11<=10    //1 2 3
			
			for(int l = 5 ; l>=i ; l--) {  //11<=10   //1 2 3
				System.out.print("*");
			}
			
			System.out.println();
		}

	}
}
