package com.vti.entity;

public class Employee extends User {
	private Project	projectID;
	private String ProSkill;

	public Employee(int id, String fullName, String email, String password, Role role, String ProSkill, Project projectID) {
		super(id, fullName, email, password, role.EMPLOYEE);
		
		this.projectID = projectID;
		this.ProSkill = ProSkill;

	}

	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
	}

	@Override
	public String toString() {
		return "Employee [projectID=" + projectID + ", ProSkill=" + ProSkill + ", getId()=" + getId()
				+ ", getFullName()=" + getFullName() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	

}
