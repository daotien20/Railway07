package Program;

import Table.Account;

public class RunMethod {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
	}

	private static void question3() {
		System.out.println("Question3: Các số nguyên dương nhỏ hơn 10");
		
		for (int i = 0; i < 10; i++) {
				System.out.println(i);
		}
		
		System.out.println("");
	}

	private static void question2() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question2: Thông tin các account");
		for(Account listAccount: accounts) {
			System.out.println(listAccount.toString());
		}
		
		System.out.println("");
	}

	private static void question1() {
		System.out.println("Question1: Các số chẵn nguyên dương nhỏ hơn 10");
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("");
	}		
}

