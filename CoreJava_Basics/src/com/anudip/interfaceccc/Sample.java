package com.anudip.interfaceccc;

public interface Sample {

	
	
	public abstract void m1();
	void m2();
	
	//jdk.1.8
	
	static void m3() {
		System.out.println();
	}
	
	 default void m4(){
		
	}
}
