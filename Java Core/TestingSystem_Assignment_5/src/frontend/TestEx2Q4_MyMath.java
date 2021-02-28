package frontend;

import entity.Ex2Q4_MyMath;

public class TestEx2Q4_MyMath {
public static void main(String[] args) {
	Ex2Q4_MyMath tinhTong = new Ex2Q4_MyMath();
	System.out.println("Tính float = " + tinhTong.sum(2.5f, 77.3f));
	System.out.println("Tính int = " + tinhTong.sum(1003, 9645));
	System.out.println("Tính byte = " + tinhTong.sum(23, 125));
	}
}
