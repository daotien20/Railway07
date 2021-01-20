package Program;

import Table.Account;
import Table.Department;

public class RunForEach {

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
		
		question8();
		question9();
	}

	private static void question9() {
		Department[] departments = AddData.addDepartment();
		
		System.out.println("Question 9----------------------");
		for (Department department : departments) {
			System.out.println("Department ID: " + department.departmentID);
			System.out.println("Department Name: " + department.departmentName);
			System.out.println("");
		}		
	}

	private static void question8() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 8----------------------");
		for (Account account : accounts) {
			System.out.println("Email: " + account.email);
			System.out.println("Full Name: " + account.fullName);
			System.out.println("Department of Account: " + account.department.departmentName);
			System.out.println("");
		}		
	}

}
