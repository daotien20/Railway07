package backend;

import entity.HinhHoc;

public class HinhTron extends HinhHoc implements BeHinhHoc{

	public HinhTron(double a, double b) throws Exception {
		super(a, b);
	}

	@Override
	public void tinhChuVi(double a, double b) {
		System.out.println("Kết quả = " + a*HinhHoc.PI);
	}

	@Override
	public void tinhDienTich(double a, double b) {
		System.out.println("Kết quả = " + a*b*HinhHoc.PI);
	}

}
