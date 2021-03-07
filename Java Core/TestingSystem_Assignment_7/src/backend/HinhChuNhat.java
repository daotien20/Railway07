package backend;

import entity.HinhHoc;

public class HinhChuNhat extends HinhHoc implements BeHinhHoc {
	public HinhChuNhat(double a, double b) throws Exception {
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
