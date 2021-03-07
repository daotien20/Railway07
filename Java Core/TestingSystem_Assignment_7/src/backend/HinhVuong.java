package backend;

import entity.HinhHoc;

public class HinhVuong extends HinhHoc implements BeHinhHoc {
	public HinhVuong(double a, double b) throws Exception {
		super(a, b);
	}

	@Override
	public void tinhChuVi(double a, double b) {
		System.out.println("Kết quả = "+ ((a+b)*2));
	}

	@Override
	public void tinhDienTich(double a, double b) {
		System.out.println("Kết quả = " + (a*b));
	}
	
}
