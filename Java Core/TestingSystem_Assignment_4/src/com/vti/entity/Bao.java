package com.vti.entity;

import java.util.Scanner;

public class Bao extends TaiLieu{
	private String ngayPhatHanh;

	public Bao() {
		super();
	}
	
	public Bao(int maTaiLieu, String tenNXB, int soBanPhatHanh, String ngayPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}


	public String getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(String ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	
	public void inputBao() {
		super.inputTaiLieu();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập ngày phát hành: ");
		setNgayPhatHanh(scanner.nextLine());
		
	}
	
	public void getInforBao() {
		super.getInforTL();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ngày phát hành		: " + getNgayPhatHanh());
	
	}
}
