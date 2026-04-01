package com.anudip.encapsu;

public class Bank {

	private double balance;  //0.0

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance>0) {
			this.balance = balance;
		}else{
			System.out.println("invalid value");
		}
	}

}
