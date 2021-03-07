package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import utils.FileManager;
import utils.ScannerUtils;

public class Ex5_Student {
	private int id;
	private String name;
	Student[] students = new Student[3];
	Scanner scanner = new Scanner(System.in);

	public Ex5_Student() {
		super();
	}

	public Ex5_Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ex5_Student [id=" + id + ", name=" + name + "]";
	}

	public void inputStudent() {
			System.out.println("Nhập ID: ");
			setId(ScannerUtils.inputId());
			System.out.println("Nhập Họ và tên: ");
			setName(ScannerUtils.inputName());
	}
	
	public List<String> inforStudent() {
		String s1 = "";
		String s2 = "";
		String s3 = "";
		List<String> content = new ArrayList<String>();
		for (int i = 0; i < students.length; i++) {
			inputStudent();
			
			s1 = "Student " + (i + 1) + ":";
			s2 = "id: " + getId();
			s3 = "Họ và tên: " + getName();
			String studentInfo = s1 + s2 + s3;
			content.add(studentInfo);
		}
		return content;
	}

}
