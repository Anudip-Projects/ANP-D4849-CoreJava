package com.anudip.exceptHandling;

public class Test02 {

	public static void main(String[] args) {		

		try {
			int a = Integer.parseInt(args[0]);		
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("hey user, you have to pass minimum two valuse at least ");
		}catch(NumberFormatException ne) {
			System.out.println("hey dummy fellow, please pass both the number in digit");
		}catch(ArithmeticException ae) {
			System.out.println("hey fellow, dont pass second digit as zero");
		}


	}

}
