package Program;

import Table.Account;
import Table.Group;

public class RunSwitchCase {

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
		
		question5();
		question6();
		question7();
	}

	private static void question7() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 7----------------------");
		switch (accounts[0].position.positionName) {
		case DEV:
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
		System.out.println("");
	}

	private static void question6() {
		Account[] accounts = AddData.addAccount();
		Group[] groups = AddData.addGroup();
		
		Group[] groupsOfAccount1 = { groups[0], groups[1] };
		accounts[0].groups = groupsOfAccount1;

		Group[] groupsOfAccount2 = { groups[1], groups[2] };
		accounts[1].groups = groupsOfAccount2;

		Group[] groupsOfAccount3 = { groups[0], groups[2] };
		accounts[2].groups = groupsOfAccount3;
		
		System.out.println("Question 6----------------------");
		switch (accounts[1].groups.length) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 2:				
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}
		System.out.println("");		
	}

	private static void question5() {
		Account[] accounts = AddData.addAccount();
		Group[] groups = AddData.addGroup();
		
		Account[] accountsOfGroup1 = { accounts[0], accounts[2] };
		groups[0].accounts = accountsOfGroup1;

		Account[] accountsOfGroup2 = { accounts[0], accounts[1] };
		groups[1].accounts = accountsOfGroup2;

		Account[] accountsOfGroup3 = { accounts[1], accounts[2] };
		groups[2].accounts = accountsOfGroup3;
		
		System.out.println("Question 5----------------------");
		switch (groups[0].accounts.length) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}
		System.out.println("");
	}

}
