package com.sp;

public class Student {
	private int roll;
	private String name;
	private String city;
	
	public Student() {
		super();
	}
	public Student(int roll,String name,String city) {
		super();
		this.roll=roll;
		this.name=name;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + "]";
	}
	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int getRoll() {
		return roll;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getCity() {
		return city;
	}
	
	
}
