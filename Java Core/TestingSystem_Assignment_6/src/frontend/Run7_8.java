package frontend;

import java.util.Scanner;

import backend.ScannerUtils;

public class Run7_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		question7();
//		question8_float();
//		question8_double();
//		question8_string();

	}

	private static void question8_string() {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập vào 1 chuỗi với <=5 ký tự: ");
			String s1 = ScannerUtils.inputString("Lỗi! Không được để trống! Mời nhập lại: ");
			
			if(s1.length()<= 5 && s1.length() >=0) {
				System.out.println("Kết quả: " + s1);
				return;
			} else {
				System.out.println("");
				System.out.println("Thừa ký tự! Nhập lại!");
				continue;
			}
		}
	}

	private static void question8_double() {
		while (true) {
			System.out.println("Nhập vào điểm TB: ");
			double diemTB = ScannerUtils.inputDouble("Lỗi! Điểm trung bình phải là 1 số! Mời nhập lại: ");

			if (diemTB >= 0) {
				System.out.println("Điểm TB: " + diemTB);
				return;
			} else {
				System.out.println("");
				System.out.println("Số phải >= 0. Nhập lại!");
				continue;
			}
		}
	}

	private static void question8_float() {
		while (true) {
			System.out.println("Nhập vào điểm TB: ");
			float diemTB = ScannerUtils.inputFloat("Lỗi! Điểm trung bình phải là 1 số! Mời nhập lại: ");

			if (diemTB >= 0) {
				System.out.println("Điểm TB: " + diemTB);
				return;
			} else {
				System.out.println("");
				System.out.println("Số phải >= 0. Nhập lại!");
				continue;
			}
		}
	}

	public static void question7() {
		while (true) {

			System.out.println("Nhập vào tuổi: ");
			int age = ScannerUtils.inputInt("Lỗi! Tuổi phải là 1 số nguyên! Mời nhập lại: ");

			System.out.println("Nhập id: ");
			int id = ScannerUtils.inputInt("Lỗi! ID phải là 1 số nguyên! Mời nhập lại: ");

			if (age >= 0 && id >= 0) {
				System.out.println("Tuổi: " + age);
				System.out.println("ID: " + id);
				return;
			} else {
				System.out.println("");
				System.out.println("Số phải >= 0. Nhập lại!");
				continue;
			}
		}
	}
}
