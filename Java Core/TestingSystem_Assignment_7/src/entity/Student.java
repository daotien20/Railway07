package entity;

import java.util.Scanner;

public class Student {
	public static int count;
	public static String college = "Đại học Bách Khoa";
	private int id;
	private String name;
	public static int moneyGroup;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		count++;
	}

	public Student() {
	}

	public static String getCollege() {
		return college;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college;
	}
	
	//method cho phép thay đổi college
	public static void changeCollege() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("College hiện tại: " + college);
		System.out.println("Đổi sang College: ");
		Student.setCollege(scanner.nextLine());
	}
	
	public static void showCollege() {
		System.out.println("College mới: " + Student.getCollege());
	}
	
}
