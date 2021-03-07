package frontend;

import java.util.Scanner;

import backend.BeQ4;

public class TestQ4 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Input: ");
			BeQ4.getIndex(scanner.nextInt());
		} catch (Exception e) {
			System.out.println("Cannot find department");
		}
	}
}

	
	
	
	
	
	
