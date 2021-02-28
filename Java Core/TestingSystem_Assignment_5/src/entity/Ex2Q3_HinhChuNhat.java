package entity;

import java.util.Scanner;

import backend.BeEx2Q3_HinhChuNhat;

public class Ex2Q3_HinhChuNhat implements BeEx2Q3_HinhChuNhat {
	private float chieuDai;
	private float chieuRong;
	
	@Override
	public void tinhChuVi() {
		System.out.println("Tính chu vi");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		chieuDai = scanner.nextFloat();
		System.out.println("Nhập chiều rộng:");
		chieuRong = scanner.nextFloat();
		float chuviHCN = (chieuDai + chieuRong) * 2;
		System.out.println("Kết quả: " + chuviHCN);
		
	}
	
	@Override
	public void tinhDienTich() {
		System.out.println("");
		System.out.println("Tính diện tích");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		chieuDai = scanner.nextFloat();
		System.out.println("Nhập chiều rộng:");
		chieuRong = scanner.nextFloat();
		float dientichHCN = chieuDai * chieuRong;
		System.out.println("Kết quả: " + dientichHCN);
	}

	
}
