package com.vti.entity;

public abstract class User {
	String	name;
	double	salaryRatio;
	
	public User(String name, double salaryRatio) {
		this.name = name;
		this.salaryRatio = salaryRatio;
	}
	
	public abstract double calculatePay();
	
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Salary ratio: " + salaryRatio);
		System.out.println("Salary: " + calculatePay());
	}
}
