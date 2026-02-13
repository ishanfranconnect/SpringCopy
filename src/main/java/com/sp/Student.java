package com.sp;

public class Student {
	private int roll;
	private String name;
	private Address a;
	// private String city;
	
	public Student() {
		super();
	}
	public Student(int roll,String name,Address a) {
		super();
		this.roll=roll;
		this.name=name;
		this.a=a;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ",a="+a+"]";
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
	public Address getA(){
		return a;
	}
	public void setA(Address a){
		this.a=a;
	}
	
	
}
