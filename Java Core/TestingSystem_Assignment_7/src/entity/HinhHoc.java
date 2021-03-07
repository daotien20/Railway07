package entity;

import backend.Configs;

public class HinhHoc {
	public static final float PI = 3.14f;
	private double a;
	private double b;
	public static int count;
	
	public HinhHoc() throws Exception {
		if(count > Configs.SO_LUONG_HINH_TOI_DA) {
			throw new Exception("Đã tạo 5 hình. Không thể tạo thêm!") ;
		}else {
			this.a = a;
			this.b = b;
		}
	}

	public HinhHoc(double a, double b) {
		this.a = a;
		this.b = b;
		count++;
	}

	public static float getPi() {
		return PI;
	}

	public double geta() {
		return a;
	}

	public double getb() {
		return b;
	}
	public void seta(double a) {
		this.a = a;
	}
	
	public void setb(double b) {
		this.b = b;
	}
	
}
