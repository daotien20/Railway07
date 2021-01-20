package Program;

import entity.Department;

public class RunObjectsMethod {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
//		question6();
//		question7();
	}

	private static void question7() {
		
	}

	private static void question6() {
		
	}

	private static void question5() {
		Department[] departments = AddData.addDepartment();
		System.out.println(departments[0].equals(departments[1]));		
	}

	private static void question4() {
		Department[] departments = AddData.addDepartment();
		String s1 = "Phòng A";
		System.out.println(departments[0].departmentName.equals(s1));		
	}

	private static void question3() {
		Department[] departments = AddData.addDepartment();
		System.out.println(departments[0].hashCode());
	}

	private static void question2() {
		Department[] departments = AddData.addDepartment();
		for (Department listDepartment : departments) {
			System.out.println(listDepartment.toString());
		}
	}

	private static void question1() {
		Department[] departments = AddData.addDepartment();
		System.out.println(departments[0].toString());
		
	}

}
