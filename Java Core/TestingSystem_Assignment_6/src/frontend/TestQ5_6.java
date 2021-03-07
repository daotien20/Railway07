package frontend;

import java.util.Scanner;

public class TestQ5_6 {
public static void main(String[] args) {
	inputAge();
}

private static int inputAge() {
	while(true) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập vào 1 số nguyên >= 0: ");
			int n = scanner.nextInt();
			
			if(n>=0) {
				System.out.println(n);
				return n;
			} else {
				System.out.println("Wrong inputing! The age must be greater then 0, please input again.");
				continue;
			}
		} catch (Exception e) {
			System.out.println("Wrong inputing! Please input an age as int, input again.");
			continue;
		}
	}
}
}
