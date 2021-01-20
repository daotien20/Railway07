package Program;

import Table.Account;
import Table.Department;

public class RunFor {

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
		
		question10();
		question11();
		question12();
		question13();
		question14();
		question15();
	}

	private static void question15() {
		System.out.println("Question 15----------------------");
		for (int i = 0; i <= 20; i++ ) {
			if (i % 2 == 0) {
			System.out.println(i);
			}
		}
		System.out.println("");		
	}

	private static void question14() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 14----------------------");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].accountID >= 4) {
				break;
			}
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("UserName: " + accounts[i].userName);
			System.out.println("FullName: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].department.departmentName);
			System.out.println("Vị trí: " + accounts[i].position.positionName);
			System.out.println("Ngày tạo account: " + accounts[i].createDate);
			System.out.println("");
			}	
	}

	private static void question13() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 13----------------------");
		for (int i = 0; i < accounts.length; i++) {
			if (i == 1) {
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
			}		
	}

	private static void question12() {
		Department[] departments = AddData.addDepartment();
		
		System.out.println("Question 12----------------------");
		for (int i = 0; i < 2; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + departments[i].departmentID);
			System.out.println("Name: " + departments[i].departmentName);
			System.out.println("");
			}	
	}

	private static void question11() {
		Department[] departments = AddData.addDepartment();
		
		System.out.println("Question 11----------------------");
		for (int i = 0; i < departments.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + departments[i].departmentID);
			System.out.println("Name: " + departments[i].departmentName);
			System.out.println("");
			}		
	}

	private static void question10() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 10----------------------");
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].department.departmentName);
			System.out.println("");
			}
	}

}
