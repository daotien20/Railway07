package com.vti.entity;

public class CongNhan extends CanBo{
	private int level;
	
	public CongNhan(String fullName, int age, Gender gender, String address, int level) {
		super(fullName, age, gender, address);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public CongNhan() {
	}
}
