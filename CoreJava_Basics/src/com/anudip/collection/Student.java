package com.anudip.collection;

//entity class or model class
//toString
//param and non param constru
//setter and getter method

public class Student {

	int id;
	String name;
	double courseFees;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, double courseFees) {
		super();
		this.id = id;
		this.name = name;
		this.courseFees = courseFees;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseFees=" + courseFees + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
}
