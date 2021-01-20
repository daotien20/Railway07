package Program;

import Table.Account;
import Table.Department;

public class RunDoWhile {

	public static void main(String[] args) {
//		Department[] departments = AddData.addDepartment();
//		Position[] positions = AddData.addPosition();
//		Account[] accounts = AddData.addAccount();
//		Group[] groups = AddData.addGroup();
//		TypeQuestion[] types = AddData.addTypeQuestion();
//		CategoryQuestion[] categories = AddData.addCategoryQuestion();
//		Question[] questions = AddData.addQuestion();
//		Answer[] answers = AddData.addAnswer();
//		Exam[] exams = AddData.addExam();
		
		question17_10();
		question17_11();
		question17_12();
		question17_13();
		question17_14();
		question17_15();
	}

	private static void question17_15() {
		System.out.println("Question 17_15----------------------");
		int i = 0;
		do {
			if (i % 2 == 0) {
				System.out.println(i);	
			}
			i++;
			}
		while (i <= 20);
	}

	private static void question17_14() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 17_14----------------------");
		int i = 0;
		do {
			if (accounts[i].accountID < 4) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("UserName: " + accounts[i].userName);
				System.out.println("FullName: " + accounts[i].fullName);
				System.out.println("Phòng ban: " + accounts[i].department.departmentName);
				System.out.println("Vị trí: " + accounts[i].position.positionName);
				System.out.println("Ngày tạo account: " + accounts[i].createDate);
				System.out.println("");
			i++;
				}
			}
		while (i < accounts.length);
		System.out.println("");		
	}

	private static void question17_13() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 17_13----------------------");
		int i = 0;
		do {
			if(i == 1) {
				i++;
				continue; 
			}
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("UserName: " + accounts[i].userName);
			System.out.println("FullName: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].department.departmentName);
			System.out.println("Vị trí: " + accounts[i].position.positionName);
			System.out.println("Ngày tạo account: " + accounts[i].createDate);
			System.out.println("");
			i++;
			}
		while (i < accounts.length);
		System.out.println("");
	}

	private static void question17_12() {
		Department[] departments = AddData.addDepartment();
		
		System.out.println("Question 17_12----------------------");
		int i = 0;
		do {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + departments[i].departmentID);
			System.out.println("Name: " + departments[i].departmentName);
			System.out.println("");
			i++;
			}
		while (i < 2);
		System.out.println("");
	}

	private static void question17_11() {
		Department[] departments = AddData.addDepartment();
		
		System.out.println("Question 17_11----------------------");
		int i = 0;
		do {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + departments[i].departmentID);
			System.out.println("Name: " + departments[i].departmentName);
			System.out.println("");
			i++;
			}
		while (i < departments.length);
		System.out.println("");
	}

	private static void question17_10() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 17_10----------------------");
		int i = 0;
		do {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].department.departmentName);
			System.out.println("");
			i++;
			}
		while (i < accounts.length);
		System.out.println("");		
	}

}
