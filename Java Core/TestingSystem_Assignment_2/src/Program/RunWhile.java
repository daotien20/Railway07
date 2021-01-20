package Program;

import Table.Account;
import Table.Department;

public class RunWhile {

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
		
		question16_10();
		question16_11();
		question16_12();
		question16_13();
		question16_14();
		question16_15();
	}

	private static void question16_15() {
		System.out.println("Question 16_15----------------------");
		int i = 0;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.println(i);	
			}
		i++;
		}
		System.out.println("");		
	}

	private static void question16_14() {
		System.out.println("Question 16_14----------------------");
		Account[] accounts = AddData.addAccount();
		
		int i = 0;
		while (i < accounts.length) {
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
	}

	private static void question16_13() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 16_13----------------------");
		int i = 0;
		while (i < accounts.length) {
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
	}

	private static void question16_12() {
		Department[] departments = AddData.addDepartment();
		
		System.out.println("Question 16_12----------------------");
		int i = 0;
		while (i < 2) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + departments[i].departmentID);
			System.out.println("Name: " + departments[i].departmentName);
			System.out.println("");
			i++;
		}
	}

	private static void question16_11() {
		Department[] departments = AddData.addDepartment();
		
		System.out.println("Question 16_11----------------------");
		int i = 0;
		while (i < departments.length) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + departments[i].departmentID);
			System.out.println("Name: " + departments[i].departmentName);
			System.out.println("");
			i++;
		}		
	}

	private static void question16_10() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 16_10----------------------");
		int i = 0;
		while (i < accounts.length) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].department.departmentName);
			System.out.println("");
			i++;
			}			
	}

}
