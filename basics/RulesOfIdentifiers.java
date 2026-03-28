package com.anudip.basics;

public class RulesOfIdentifiers {

	public static void main(String[] args) {
		
		//alphabet, digit and speci char
		int personAge = 20;
		
		//you cant not start with digit
		//String 9personName = "XYZ";
		String person345435Name5444 = "XYZ";
		
		//space is not allowed
		//int person  age = 20;  //error
		int p_age = 20;
		
		
		//only $ and  _  allowed in special character
		int person$Agee = 20;
		int person_Ageee = 20;
		//int person*Agee = 20;
		
	}
}
