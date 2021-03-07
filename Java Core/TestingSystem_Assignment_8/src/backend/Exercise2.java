package backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entity.Student3;

public class Exercise2 {
	static List<Student3> listStudent = new ArrayList<>();
	public static void question1() {
		
		Student3 student1 = new Student3(1, "Nguyễn Quỳnh", "1999-12-25", 9);
		Student3 student2 = new Student3(2, "Trần Thanh Sơn", "1997-11-03", 8);
		Student3 student3 = new Student3(3, "Chu Quỳnh Hoa", "1998-10-14", 5);
		Student3 student4 = new Student3(4, "Phạm Thúy Hòa", "1999-05-06", 7);
		Student3 student5 = new Student3(5, "Trương Kiệu", "1994-04-25", 6);
		Student3 student6 = new Student3(6, "Trần Thanh Sơn", "1997-12-03", 8);
		Student3 student7 = new Student3(2, "Trần Thanh Sơn", "1997-12-03", 5);
		
		listStudent.add(student1);
		listStudent.add(student2);
		listStudent.add(student3);
		listStudent.add(student4);
		listStudent.add(student5);
		listStudent.add(student6);
		listStudent.add(student7);
		
		Collections.sort(listStudent);
		
		for(Student3 student: listStudent) {
			System.out.println(student.toString());
		
		}
	}
	
	public static void question2() {
		question1();
	}
}
