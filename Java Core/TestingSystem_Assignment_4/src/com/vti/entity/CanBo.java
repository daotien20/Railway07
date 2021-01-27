package com.vti.entity;

public class CanBo {
	private String fullName;
	private int age;
	private Gender gender;
	private String address;

	public CanBo(String fullName, int age, Gender gender, String address) {
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	@Override
	public String toString() {
		return "CanBo [fullName=" + fullName + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}

	public CanBo() {

	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(int gioiTinh) {

		if (gioiTinh == 1) {
			this.gender = Gender.valueOf("MALE");
		
		} else if (gioiTinh == 2) {
			this.gender = Gender.valueOf("FEMALE");
		
		} else {
			this.gender = Gender.valueOf("UNKNOWN");
	
		}

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void getInfor() {
		System.out.println("Họ tên      : " + getFullName());
		System.out.println("Tuổi        : " + getAge());
		System.out.println("Giới tính   : " + getGender());
		System.out.println("Địa chỉ     : " + getAddress());
	}
}
