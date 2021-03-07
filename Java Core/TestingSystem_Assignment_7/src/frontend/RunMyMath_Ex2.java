package frontend;

import java.util.Scanner;

import entity.Ex2_MyMath;

public class RunMyMath_Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a: ");
		int x = scanner.nextInt();
		System.out.println("Kết quả = " + sum(x));
	}

	private static double sum(int a) {
//		Ex2_MyMath.setPI(3.15);
		return a + Ex2_MyMath.PI; 
		
	}

}
