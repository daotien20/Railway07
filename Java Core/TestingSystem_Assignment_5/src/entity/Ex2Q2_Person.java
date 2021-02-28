package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2Q2_Person {
	private String name;
	private String gender;
	private String birthDate;
	private String address;
	
	////constructor đầy đủ tham số
	public Ex2Q2_Person(String name, String gender, String birthDate, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.address = address;
	}
	
	//constructor không tham số
	public Ex2Q2_Person() {
		super();
	}
	
	//đầy đủ getter, setter
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập tên: ");
		name = scanner.nextLine();
		System.out.println("Nhập giới tính: ");
		gender = scanner.nextLine();
		System.out.println("Nhập địa chỉ: ");
		address = scanner.nextLine();
		System.out.println("Nhập ngày sinh: ");
		birthDate = scanner.nextLine();
		
}
	public void showInfo() {
		System.out.println("Tên: " + name);
		System.out.println("Giới tính: " + gender);
		System.out.println("Ngày sinh: " + birthDate);
		System.out.println("Địa chỉ: " + address);
	}
}
	

