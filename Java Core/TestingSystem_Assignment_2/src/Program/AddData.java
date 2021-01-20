package Program;

import Table.Position;
import Table.PositionName;
import Table.Question;
import Table.TypeQuestion;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import Table.Answer;
import Table.TypeName;
import Table.Account;
import Table.CategoryQuestion;
import Table.Department;
import Table.Exam;
import Table.Group;

public class AddData {
	public static Department[] addDepartment() {
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Test";
		
		Department departments[] = {department1,department2,department3};
		
		return departments;
	}
	
	public static Position[] addPosition() {
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = PositionName.DEV;

		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = PositionName.PM;

		Position position3 = new Position();
		position3.positionID = 3;
		position3.positionName = PositionName.SCUM_MASTER;
		
		Position positions[]= {position1,position2,position3};
		
		return positions;
	}
	
	public static Account[] addAccount() {
		Department[] departments = addDepartment();
		Position[] positions = addPosition();
//		Group[] groups = addGroup();
		
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "cuongnm@gmail.com";
		account1.userName = "cuongnm";
		account1.fullName = "nguyen cuong";
		account1.department = departments[1];
		account1.position = positions[2];
		account1.createDate = LocalDate.of(2019, 12, 23);

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "hoangvanthu@gmail.com";
		account2.userName = "hoangvanthu";
		account2.fullName = "hoang van thu";
		account2.department = departments[0];
		account2.position = positions[1];
		account2.createDate = LocalDate.of(2019, 12, 23);

		Account account3 = new Account();
		account3.accountID = 2;
		account3.email = "nguyenchienthang@gmail.com";
		account3.userName = "nguyenc";
		account3.fullName = "nguyen chien thang";
		account3.department = departments[2];
		account3.position = positions[1];
		account3.createDate = LocalDate.of(2019, 12, 23);
		
//		Group[] groupsOfAccount1 = { groups[0], groups[1] };
//		account1.groups = groupsOfAccount1;
//
//		Group[] groupsOfAccount2 = { groups[1], groups[2] };
//		account2.groups = groupsOfAccount2;
//
//		Group[] groupsOfAccount3 = { groups[0], groups[2] };
//		account3.groups = groupsOfAccount3;
//		
		Account[] accounts = {account1,account2,account3};
		
		return accounts;
	}
	
	public static Group[] addGroup() {
		Account[] accounts = addAccount();
		
		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "group so 1";
		group1.creator = accounts[0];
		group1.createDate = LocalDate.of(2019, 12, 25);

		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "group so 2";
		group2.creator = accounts[2];
		group2.createDate = LocalDate.of(2019, 12, 25);

		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "group so 3";
		group3.creator = accounts[1];
		group3.createDate = LocalDate.of(2019, 12, 25);

//		Account[] accountsOfGroup1 = { accounts[0], accounts[2] };
//		group1.accounts = accountsOfGroup1;
//
//		Account[] accountsOfGroup2 = { accounts[0], accounts[1] };
//		group2.accounts = accountsOfGroup2;
//
//		Account[] accountsOfGroup3 = { accounts[1], accounts[2] };
//		group3.accounts = accountsOfGroup3;
		
		Group[] groups = {group1,group2,group3};
		
		return groups;
	}
	
	public static TypeQuestion[] addTypeQuestion() {
		TypeQuestion type1 = new TypeQuestion();
		type1.typeID = 1;
		type1.typeName = TypeName.ESSAY;

		TypeQuestion type2 = new TypeQuestion();
		type2.typeID = 2;
		type2.typeName = TypeName.MULTIPLE_CHOICE;
		
		TypeQuestion[] types = {type1,type2};
		return types;
	}
	
	public static CategoryQuestion[] addCategoryQuestion() {
		CategoryQuestion category1 = new CategoryQuestion();
		category1.categoryID = 1;
		category1.categoryName = "Java";

		CategoryQuestion category2 = new CategoryQuestion();
		category2.categoryID = 2;
		category2.categoryName = "Python";

		CategoryQuestion category3 = new CategoryQuestion();
		category3.categoryID = 3;
		category3.categoryName = "C";
		
		CategoryQuestion[] categories = {category1,category2,category3};
		return categories;
	}
	
	public static Question[] addQuestion() {
		CategoryQuestion[] categories = addCategoryQuestion();
		TypeQuestion[] types = addTypeQuestion();
		Account[] accounts = addAccount();
//		Exam[] exams = addExam();
		
		Question question1 = new Question();
		question1.questionID = 1;
		question1.content = "cau hoi so 1";
		question1.category = categories[0];
		question1.type = types[0];
		question1.creator = accounts[0];
		question1.createDate = LocalDate.of(2020, 01, 01);

		Question question2 = new Question();
		question2.questionID = 2;
		question2.content = "cau hoi so 2";
		question2.category = categories[0];
		question2.type = types[1];
		question2.creator = accounts[0];
		question2.createDate = LocalDate.of(2020, 01, 01);

		Question question3 = new Question();
		question3.questionID = 3;
		question3.content = "cau hoi so 3";
		question3.category = categories[1];
		question3.type = types[1];
		question3.creator = accounts[1];
		question3.createDate = LocalDate.of(2020, 01, 01);
		
//		Exam[] examsOfQuestion1 = { exams[0], exams[1] };
//		question1.exams = examsOfQuestion1;
//
//		Exam[] examsOfQuestion2 = { exams[1], exams[2] };
//		question2.exams = examsOfQuestion2;
//
//		Exam[] examsOfQuestion3 = { exams[0], exams[2] };
//		question3.exams = examsOfQuestion3;

		Question[] questions = {question1,question2,question3};
		return questions;
	}
	
	public static Answer[] addAnswer() {
		Question[] questions = addQuestion();
		
		Answer answer1 = new Answer();
		answer1.answerID = 1;
		answer1.content = "cau tra loi so 1";
		answer1.question = questions[2];
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.answerID = 2;
		answer2.content = "cau tra loi so 2";
		answer2.question = questions[2];
		answer2.isCorrect = false;

		Answer answer3 = new Answer();
		answer3.answerID = 3;
		answer3.content = "cau tra loi so 3";
		answer3.question = questions[1];
		answer3.isCorrect = true;
		
		Answer[] answers = {answer1,answer2,answer3};
		return answers;
	}
	
	public static Exam[] addExam() {
		CategoryQuestion[] categories = addCategoryQuestion();
		Account[] accounts = addAccount();
//		Question[] questions =addQuestion();
		
		Exam exam1 = new Exam();
		exam1.examID = 1;
		exam1.code = "EX001";
		exam1.title = "Python Final Exam";
		exam1.category = categories[0];
		exam1.duration = 60;
		exam1.creator = accounts[0];
		exam1.createDate = new Date(2020-1900, 01-01, 01);

		Exam exam2 = new Exam();
		exam2.examID = 2;
		exam2.code = "EX002";
		exam2.title = ".NET Final Exam";
		exam2.category = categories[1];
		exam2.duration = 60;
		exam2.creator = accounts[0];
		exam2.createDate = new Date(2020-1900, 01-01, 21);

		Exam exam3 = new Exam();
		exam3.examID = 3;
		exam3.code = "EX003";
		exam3.title = "Java Final Exam";
		exam3.category = categories[0];
		exam3.duration = 120;
		exam3.creator = accounts[2];
		exam3.createDate = new Date(2020-1900, 02-01, 10);

//		Question[] questionsOfExam1 = { questions[0], questions[2] };
//		exam1.questions = questionsOfExam1;
//
//		Question[] questionsOfExam2 = { questions[0], questions[1] };
//		exam2.questions = questionsOfExam2;
//
//		Question[] questionsOfExam3 = { questions[1], questions[2] };
//		exam3.questions = questionsOfExam3;
		
		Exam[] exams = {exam1,exam2,exam3};
		return exams;
	}

	
	
}
