package Assignment1;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {

//Add data department
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Test";

//Add data position		
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = PositionName.DEV;

		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = PositionName.PM;

		Position position3 = new Position();
		position3.positionID = 3;
		position3.positionName = PositionName.SCUM_MASTER;

//Add data account		
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "cuongnm@gmail.com";
		account1.userName = "cuongnm";
		account1.fullName = "nguyen cuong";
		account1.department = department1;
		account1.position = position2;
		account1.createDate = LocalDate.of(2019, 12, 23);

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "hoangvanthu@gmail.com";
		account2.userName = "hoangvanthu";
		account2.fullName = "hoang van thu";
		account2.department = department2;
		account2.position = position1;
		account2.createDate = LocalDate.of(2019, 12, 23);

		Account account3 = new Account();
		account3.accountID = 2;
		account3.email = "nguyenchienthang@gmail.com";
		account3.userName = "nguyenc";
		account3.fullName = "nguyen chien thang";
		account3.department = department2;
		account3.position = position1;
		account3.createDate = LocalDate.of(2019, 12, 23);

//Add data group
		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "group so 1";
		group1.creator = account1;
		group1.createDate = LocalDate.of(2019, 12, 25);

		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "group so 2";
		group2.creator = account3;
		group2.createDate = LocalDate.of(2019, 12, 25);

		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "group so 3";
		group3.creator = account2;
		group3.createDate = LocalDate.of(2019, 12, 25);

		Group[] groupsOfAccount1 = { group1, group2 };
		account1.groups = groupsOfAccount1;

		Group[] groupsOfAccount2 = { group2, group3 };
		account2.groups = groupsOfAccount2;

		Group[] groupsOfAccount3 = { group1, group3 };
		account3.groups = groupsOfAccount3;

		Account[] accountsOfGroup1 = { account1, account3 };
		group1.accounts = accountsOfGroup1;

		Account[] accountsOfGroup2 = { account1, account2 };
		group2.accounts = accountsOfGroup2;

		Account[] accountsOfGroup3 = { account2, account3 };
		group3.accounts = accountsOfGroup3;

//Add data TypeQuestion
		TypeQuestion type1 = new TypeQuestion();
		type1.typeID = 1;
		type1.typeName = TypeName.ESSAY;

		TypeQuestion type2 = new TypeQuestion();
		type2.typeID = 2;
		type2.typeName = TypeName.MULTIPLE_CHOICE;

//Add data CategoryQuestion
		CategoryQuestion category1 = new CategoryQuestion();
		category1.categoryID = 1;
		category1.categoryName = "Java";

		CategoryQuestion category2 = new CategoryQuestion();
		category2.categoryID = 2;
		category2.categoryName = "Python";

		CategoryQuestion category3 = new CategoryQuestion();
		category3.categoryID = 3;
		category3.categoryName = "C";

//Add data Question
		Question question1 = new Question();
		question1.questionID = 1;
		question1.content = "cau hoi so 1";
		question1.category = category1;
		question1.type = type1;
		question1.creator = account1;
		question1.createDate = LocalDate.of(2020, 01, 01);

		Question question2 = new Question();
		question2.questionID = 2;
		question2.content = "cau hoi so 2";
		question2.category = category1;
		question2.type = type1;
		question2.creator = account1;
		question2.createDate = LocalDate.of(2020, 01, 01);

		Question question3 = new Question();
		question3.questionID = 3;
		question3.content = "cau hoi so 3";
		question3.category = category2;
		question3.type = type2;
		question3.creator = account1;
		question3.createDate = LocalDate.of(2020, 01, 01);

//Add data Answer
		Answer answer1 = new Answer();
		answer1.answerID = 1;
		answer1.content = "cau tra loi so 1";
		answer1.question = question2;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.answerID = 2;
		answer2.content = "cau tra loi so 2";
		answer2.question = question2;
		answer2.isCorrect = false;

		Answer answer3 = new Answer();
		answer3.answerID = 3;
		answer3.content = "cau tra loi so 3";
		answer3.question = question1;
		answer3.isCorrect = true;

//Add data exam
		Exam exam1 = new Exam();
		exam1.examID = 1;
		exam1.code = "EX001";
		exam1.title = "Python Final Exam";
		exam1.category = category1;
		exam1.duration = 60;
		exam1.creator = account1;
		exam1.createDate = LocalDate.of(2020, 01, 01);

		Exam exam2 = new Exam();
		exam2.examID = 2;
		exam2.code = "EX002";
		exam2.title = ".NET Final Exam";
		exam2.category = category2;
		exam2.duration = 60;
		exam2.creator = account1;
		exam2.createDate = LocalDate.of(2020, 01, 01);

		Exam exam3 = new Exam();
		exam3.examID = 3;
		exam3.code = "EX003";
		exam3.title = "Java Final Exam";
		exam3.category = category1;
		exam3.duration = 120;
		exam3.creator = account3;
		exam3.createDate = LocalDate.of(2020, 01, 01);

		Exam[] examsOfQuestion1 = { exam1, exam2 };
		question1.exams = examsOfQuestion1;

		Exam[] examsOfQuestion2 = { exam2, exam3 };
		question2.exams = examsOfQuestion2;

		Exam[] examsOfQuestion3 = { exam1, exam3 };
		question3.exams = examsOfQuestion3;

		Question[] questionsOfExam1 = { question1, question3 };
		exam1.questions = questionsOfExam1;

		Question[] questionsOfExam2 = { question1, question2 };
		exam2.questions = questionsOfExam2;

		Question[] questionsOfExam3 = { question2, question3 };
		exam3.questions = questionsOfExam3;


		System.out.println("Department ID: " + department1.departmentID);
		System.out.println("Department Name: " + department1.departmentName);
		System.out.println("");

		System.out.println("Position ID: " + position1.positionID);
		System.out.println("Position ID: " + position1.positionName);
		System.out.println("");

		System.out.println("Account ID: " + account1.accountID);
		System.out.println("Account Email: " + account1.email);
		System.out.println("Account Username: " + account1.userName);
		System.out.println("Account Fullname: " + account1.fullName);
		System.out.println("Account Department: " + account1.department.departmentName);
		System.out.println("Account Position: " + account1.position.positionName);
		System.out.println("Create Date: " + account1.createDate);
		System.out.println("Groups of Account: ");
		for (int i = 0; i < account1.groups.length; i++) {
			System.out.println(account1.groups[i].groupName);
		}
		System.out.println("");

		System.out.println("Group ID: " + group1.groupID);
		System.out.println("Group Name: " + group1.groupName);
		System.out.println("Creator ID: " + group1.creator.accountID);
		System.out.println("Create Date: " + group1.createDate);
		System.out.println("Accounts of Group: ");
		for (int i = 0; i < group1.accounts.length; i++) {
			System.out.println(group1.accounts[i].userName);
		}
		System.out.println("");

		System.out.println("Type Question ID: " + type1.typeID);
		System.out.println("Type Question Name: " + type1.typeName);
		System.out.println("");

		System.out.println("Category Question ID: " + category1.categoryID);
		System.out.println("Category Question Name: " + category1.categoryName);
		System.out.println("");

		System.out.println("Question ID: " + question1.questionID);
		System.out.println("Content: " + question1.content);
		System.out.println("Category ID : " + question1.category.categoryID);
		System.out.println("Type ID : " + question1.type.typeID);
		System.out.println("Creator ID : " + question1.creator.accountID);
		System.out.println("Create Date: " + question1.createDate);
		System.out.println("Exams that have this question: ");
		for (int i = 0; i < question1.exams.length; i++) {
			System.out.println(question1.exams[i].code);
		}
		System.out.println("");

		System.out.println("Answer ID: " + answer1.answerID);
		System.out.println("Content: " + answer1.content);
		System.out.println("Question ID : " + answer1.question.questionID);
		System.out.println("True/ False : " + answer1.isCorrect);
		System.out.println("");

		System.out.println("Exam ID: " + exam1.examID);
		System.out.println("Code: " + exam1.code);
		System.out.println("Title : " + exam1.title);
		System.out.println("Category ID : " + exam1.category.categoryID);
		System.out.println("Duration : " + exam1.duration);
		System.out.println("Creator ID : " + exam1.creator.accountID);
		System.out.println("Create Date: " + exam1.createDate);
		System.out.println("Questions of Exam: ");
		for (int i = 0; i < exam1.questions.length; i++) {
			System.out.println(exam1.questions[i].content);
			
		
		}
		
		System.out.println(account2.department == null?
				"Nhân viên này chưa có phòng ban":
				"Phòng ban của nhân viên này là " + account2.department.departmentName);
	}

}