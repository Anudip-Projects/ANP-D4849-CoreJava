package com.anudip.inheri.hasA;

public class Bike {

	String bikeColor;
	String bikeName;
	
	
	@Override
	public String toString() {
		return "Bike [bikeColor=" + bikeColor + ", bikeName=" + bikeName + "]";
	}
	public Bike(String bikeColor, String bikeName) {
		super();
		this.bikeColor = bikeColor;
		this.bikeName = bikeName;
	} 
}
