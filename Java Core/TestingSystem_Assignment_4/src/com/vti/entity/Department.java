package com.vti.entity;

public class Department {
	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}
	private int    departmentID;
	private String departmentName;
	
	public Department() {
		super();
	}
	public Department(String departmentName) {
		super();
		this.departmentID = 0;
		this.departmentName = departmentName;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}

