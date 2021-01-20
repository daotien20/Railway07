package Program;

import java.util.Random;
import java.util.Scanner;

public class RunDatatypeCasting {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4(0, 0);
		
		
		
	}

	
	private static float question4(int a, int b) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số nguyên a: ");
		a = scanner.nextInt();
		while(true) {
			System.out.println("Nhập số nguyên b: ");
			b = scanner.nextInt();
			if(b == 0) {
				System.out.println("Nhập lại số b");
				continue;
			}else {
				break;
			}
		
		}
		System.out.printf("%s %.2f", "a/b =", (float) a/b);
		return (float) a/b;
		
	}

	private static void question3() {
		Random random = new Random();
		int x = random.nextInt(100000);
		Integer y = x;
		if(x<10) {
			String s1 = "0000" + y;
			System.out.println(s1);
			System.out.println(s1.substring(3, 5));
			
		}else if(x < 100) {
			String s2 = "000" + y;
			System.out.println(s2);
			System.out.println(s2.substring(3, 5));
			
		}else if(x < 1000) {
			String s3 = "00" + y;
			System.out.println(s3);
			System.out.println(s3.substring(3, 5));
			
		}else if(x < 10000) {
			String s4 = "0" + y;
			System.out.println(s4);
			System.out.println(s4.substring(3, 5));
			
		}else {
			String s5 = "" + y;
			System.out.println(s5);
			System.out.println(s5.substring(3, 5));
		}
		System.out.println("");
	}
	
	private static void question2() {
		Random random = new Random();
		int x = random.nextInt(100000);
		Integer y = x;
		
		if(x<10) {
			System.out.println("0000" + y);
		}else if(x < 100) {
			System.out.println("000" + y);
		}else if(x < 1000) {
			System.out.println("00" + y);
		}else if(x < 10000) {
			System.out.println("0" + y);
		}else {
			System.out.println(y);
		}
		System.out.println("");
	}

	private static void question1() {
		float luongAccount1 = 5240.5f;
		float luongAccount2 = 10970.055f;
		
		int x = (int)luongAccount1;
		int y = (int)luongAccount2;
		
		System.out.println("Lương của Account 1: " + x + "$");
		System.out.println("Lương của Account 2: " + y + "$");
		System.out.println("");
	}
}


