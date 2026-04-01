package com.anudip.inheri.hasA;

public class Address {

	String state;
	public Address(String state, String zipCode, String cityname) {
		super();
		this.state = state;
		this.zipCode = zipCode;
		this.cityname = cityname;
	}
	String zipCode;
	String cityname;
	@Override
	public String toString() {
		return "Address [state=" + state + ", zipCode=" + zipCode + ", cityname=" + cityname + "]";
	}
	
}
