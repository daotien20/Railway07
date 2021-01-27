package com.vti.entity;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;
	
	public Sach(int maTaiLieu, String tenNXB, int soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	public Sach() {
		super();
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	public void inputSach() {
		super.inputTaiLieu();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập tên tác giả: ");
		setTenTacGia(scanner.nextLine());

		System.out.println("Nhập số trang: ");
		setSoTrang(scanner.nextInt());
		scanner.nextLine();
	}
	
	public void getInforSach() {
		super.getInforTL();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tên tác giả			: " + getTenTacGia());
		System.out.println("Số trang			: " + getSoTrang());
		
	}
}
