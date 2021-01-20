package Program;

import java.time.LocalDate;

import Table.Account;
import Table.Answer;
import Table.CategoryQuestion;
import Table.Department;
import Table.Exam;
import Table.Group;
import Table.Position;
import Table.PositionName;
import Table.Question;
import Table.TypeName;
import Table.TypeQuestion;


public class RunIF {

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
		
		question1();
		question2();
		question3();
		question4();
	}


	private static void question4() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 4----------------------");
		System.out.println(accounts[0].position.positionName == PositionName.DEV ? 
				"Đây là Developer" : 
				"Người này không phải là Developer");
		System.out.println("");
	}


	private static void question3() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 3----------------------");
		System.out.println(accounts[1].department == null?
			"Nhân viên này chưa có phòng ban":
			"Phòng ban của nhân viên này là " + accounts[1].department.departmentName);
		System.out.println("");	
	}


	private static void question2() {
		Account[] accounts = AddData.addAccount();
		Group[] groups = AddData.addGroup();
		
		Group[] groupsOfAccount1 = { groups[0], groups[1] };
		accounts[0].groups = groupsOfAccount1;

		Group[] groupsOfAccount2 = { groups[1], groups[2] };
		accounts[1].groups = groupsOfAccount2;

		Group[] groupsOfAccount3 = { groups[0], groups[2] };
		accounts[2].groups = groupsOfAccount3;
		
		System.out.println("Question 2----------------------");
		if (accounts[1].groups.length == 0) {
			System.out.println("Nhân viên này chưa có group");
		}else if(accounts[1].groups.length <=2 ){
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		}else if(accounts[1].groups.length ==3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		}else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
		System.out.println("");		
	}


	private static void question1() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 1----------------------");
		if (accounts[1].department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + accounts[1].department.departmentName);
		}
		System.out.println("");
		
	}
	

}
