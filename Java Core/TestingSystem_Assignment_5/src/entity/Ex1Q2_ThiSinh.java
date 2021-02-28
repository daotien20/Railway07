package entity;

import java.util.Scanner;

public class Ex1Q2_ThiSinh {
	private int soBaoDanh;
	private String hoTen;
	private String diaChi;
	private byte mucUuTien;
	private int x;
	
	public Ex1Q2_ThiSinh() {
		super();
	}

	public int getSoBaoDanh() {
		return soBaoDanh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public byte getMucUuTien() {
		return mucUuTien;
	}

	public void setSoBaoDanh(int soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void setMucUuTien(byte mucUuTien) {
		this.mucUuTien = mucUuTien;
	}
	
	public void inputTS() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số báo danh: ");
		soBaoDanh = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhập tên thí sinh: ");
		hoTen = scanner.nextLine();
		
		System.out.println("Nhập địa chỉ: ");
		diaChi = scanner.nextLine();
		
		System.out.println("Nhập mức ưu tiên: ");
		mucUuTien = scanner.nextByte();
		scanner.nextLine();
		
		System.out.println("Nhập khối dự thi: ");
		System.out.println("1: Khối A - Toán, Lý, Hóa");
		System.out.println("2: Khối B - Toán, Hóa, Sinh");
		System.out.println("3: Khối C - Văn, Sử, Địa");
		x = scanner.nextInt();
		scanner.nextLine();	
	}
	
	public void showTS() {
		if(x == 1) {
			System.out.println("Số báo danh: " + soBaoDanh);
			System.out.println("Họ và tên: " + hoTen);
			System.out.println("Địa chỉ: " + diaChi);
			System.out.println("Mức ưu tiên: " + mucUuTien);
			System.out.println("Thi Khối A - Toán, Lý, Hóa");
		}else if(x == 2) {
			System.out.println("Số báo danh: " + soBaoDanh);
			System.out.println("Họ và tên: " + hoTen);
			System.out.println("Địa chỉ: " + diaChi);
			System.out.println("Mức ưu tiên: " + mucUuTien);
			System.out.println("Thi Khối B - Toán, Hóa, Sinh");		
		}else {
			System.out.println("Số báo danh: " + soBaoDanh);
			System.out.println("Họ và tên: " + hoTen);
			System.out.println("Địa chỉ: " + diaChi);
			System.out.println("Mức ưu tiên: " + mucUuTien);
			System.out.println("Thi Khối C - Văn, Sử, Địa");		
		}
		
	}
	
}
