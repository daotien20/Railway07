package backend;

import java.util.ArrayList;

import entity.Employee;
import entity.Phone;
import entity.Salary;
import entity.Staff;
import entity.Student4;

public class Exercise3 {
	public static void question8() {
		System.out.println("a// get ID");
		Staff.getID();
		
		System.out.println("b// get Name");
		Staff.getName();
	}
	
	public static void question7() {
		Phone.getKey();
	}

	public static void question6() {
		System.out.println("a// get Value");
		MyMap.getValue();

		System.out.println("");
		System.out.println("b// get Key");
		MyMap.getKey();
	}

	public static void question5() {

	}

//	public static void question4() {
//		List<int> intList = new ArrayList<>(arg0); 
//	}

	public static void question2() {
//		input(student);
		input(4);
		input(4.0);
	}

	public static void question1() {
		Student4 student1 = new Student4(1, "Chương");
		Student4 student2 = new Student4(2f, "Thúy");
		Student4 student3 = new Student4(3.0, "Thu");

		Student4[] students = { student1, student2, student3 };
//		System.out.println(students.toString());
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
	}

	static <T> void input(T a) {
		System.out.println(a);
	}

//	public static Employee[] inputEmloyee() {
//		Employee employee1 = new Employee();
//		employee1.setId(1);
//		employee1.setName("Hà");
//		
//	}
//	
//	
//	public static Salary[] inputSalary() {
//		Salary salary1 = new Salary();
//		salary1.setMonth(1);
//		salary1.setLuongThang(12);
//	}

}
