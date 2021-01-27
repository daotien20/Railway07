package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import com.vti.entity.HighSchoolStudent;

public class HSStudent {
public void demoHighSchool() {
		
		List<HighSchoolStudent> danhsachStudent = new ArrayList<HighSchoolStudent>();
		
		HighSchoolStudent student = new HighSchoolStudent();
		student.setId(1);
		student.setName("Nam");
		student.setClazz("Chuyên Văn");
		student.setDesiredUniversity("Đại học Công Nghệ");
		
		System.out.println(student);
	} 
}
