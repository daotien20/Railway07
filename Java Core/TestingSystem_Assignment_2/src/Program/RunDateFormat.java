package Program;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import Table.Exam;

public class RunDateFormat {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
	}

	private static void question5() {
		Exam[] exams = AddData.addExam();
		
		System.out.println("Question 5----------------------");
		for (Exam exam : exams) {
			System.out.println(exam.formatMonthDateForExam());
		}
		System.out.println("");
	}

	private static void question4() {
		Exam[] exams = AddData.addExam();
		
		System.out.println("Question 4----------------------");
		for (Exam exam : exams) {
			System.out.println(exam.formatMonthYearForExam());
		}
		System.out.println("");
	}

	private static void question3() {
		Exam[] exams = AddData.addExam();
		
		System.out.println("Question 3----------------------");
		for (Exam exam : exams) {
			System.out.println(exam.formatYearForExam());
		}
		System.out.println("");
	}

	private static void question2() {
		Exam[] exams = AddData.addExam();
		
		System.out.println("Question 2----------------------");
		for (Exam exam : exams) {
			System.out.println(exam.formatDateTimeForExam());
		}
		System.out.println("");
		
	}

	private static void question1() {
		Exam[] exams = AddData.addExam();
		
		System.out.println("Question 1----------------------");
		System.out.println(exams[0].toString());
		System.out.println("");

		
	}

}
