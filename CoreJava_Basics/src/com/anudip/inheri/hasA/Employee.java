package com.anudip.inheri.hasA;

import java.util.Objects;

//IS-A Relationship
public class Employee{
	
	int eid;
	String name;
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		a = 30;
		
//		System.out.println(a==b);  //false
//		
//		Employee e1 = new Employee(101, "Raja");
//		Employee e2 = new Employee(102, "Ramesh");
//		Employee e3 = new Employee(101, "Raja");
//		
//		System.out.println(e1);
//		System.out.println(e2);
//		System.out.println(e1==e2);  //
//		
//		System.out.println(e1==e3); //false
//		
//		System.out.println(e1.equals(e3));  //true
//		//internally equals --> calling to == opearator
//		//e1 and e3 -> haschode not same -> false
//		
//		System.out.println(e3);
//		e3 = new Employee(102, "Rajaggg");
//		System.out.println(e3);
//		System.out.println(e3.equals(e3));  //
//		
//		
//		System.out.println("+++++++++++++++++++++++++++++++++");
//		System.out.println("+++++++++++++++++++++++++++++++++");
		
//		Employee e4 = new Employee(101, "Raja");
//		System.out.println(e4);
//		
//		e4 = new Employee(1013, "Rajaaa");
//		
//		System.out.println(e4);
//		
//		System.out.println(e4==e4);   //
//		
//		System.out.println(e3.equals(e3));  //
		
		Employee e1 = new Employee(101, "Raja");
		Employee e2 = new Employee(102, "Ramesh");
		Employee e3 = new Employee(101, "Raja");
		
		System.out.println(e1==e2); //false
		System.out.println(e1==e3); // reference diff
		
		System.out.println(e1.equals(e2));  //false ref wise diff -> data wise not check
		System.out.println(e1.equals(e3));  // ref wise not same -> false -> data wise check nhi hoga
		
		System.out.println();
	}

	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(eid, name);
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
}

