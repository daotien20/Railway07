package frontend;

import entity.Ex2Q3_HinhVuong;

public class TestEx2Q3_ChuViDienTich {
	public static void main(String[] args) {
		tinhChuVi();
		tinhDienTich();
	}
	private static void tinhChuVi() {
		Ex2Q3_HinhVuong chuvi = new Ex2Q3_HinhVuong();
		chuvi.tinhChuVi();
	}
	private static void tinhDienTich() {
		Ex2Q3_HinhVuong dientich = new Ex2Q3_HinhVuong();
		dientich.tinhDienTich();;
	}
}
