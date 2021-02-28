package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2Q2_Student extends Ex2Q2_Person{
	private String maSinhVien;
	private float diemTB;
	private String email;
	
	public Ex2Q2_Student(String name, String gender, String birthDate, String address) {
		super(name, gender, birthDate, address);
	}

	public Ex2Q2_Student() {
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getEmail() {
		return email;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public void inputInfo() {
		super.inputInfo();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập mã sinh viên: ");
		maSinhVien = scanner.nextLine();
		System.out.println("Nhập điểm trung bình: ");
		diemTB = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Nhập email: ");
		email = scanner.nextLine();
		
		
	}
	
	public void showInfo() {
		super.showInfo();
			if(diemTB >= 8) {
				System.out.println("Mã sinh viên: " + maSinhVien);
				System.out.println("Email: " + email);
				System.out.println("Điểm trung bình: " + diemTB);
				System.out.println("Sinh viên được học bổng");
			}else {
				System.out.println("Mã sinh viên: " + maSinhVien);
				System.out.println("Email: " + email);
				System.out.println("Điểm trung bình: " + diemTB);
			}
	}

	
	
}
