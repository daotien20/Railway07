package com.vti.backend;

import com.vti.entity.Student;

public class Exercise4 {


public void question1() {
	Student student1 = new Student("Chung", "Hà Nội");
//	student1.setScore(8);

	Student student2 = new Student("Cường", "Hà Giang");
	student2.setScore(10);

	Student student3 = new Student("Kiên", "Hà Tây");
	student3.setScore(4);

	student3.plusScore(2.5f);

	System.out.println(student1);
	System.out.println(student2);
	System.out.println(student3);
}
}
