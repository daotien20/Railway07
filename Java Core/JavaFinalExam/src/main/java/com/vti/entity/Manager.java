package com.vti.entity;

public class Manager extends User {

	private int ExpInYear;
	private Project[] project;

	public Manager(int id, String fullName, String email, String password,int ExpInYear, Role role ) {
		super(id, fullName, email, password, role.MANAGER);
		this.ExpInYear = ExpInYear;
	}

	public Manager(int id, String fullName) {
		super(id, fullName);
	}

	public int getExpInYear() {
		return ExpInYear;
	}
	

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Manager [ExpInYear=" + ExpInYear + ", getExpInYear()=" + getExpInYear() + ", getId()=" + getId()
				+ ", getFullName()=" + getFullName() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

	

}
