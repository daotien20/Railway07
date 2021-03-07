package backend;

import entity.Department;

public class BeQ4 {
	
	static Department department1 = new Department(1, "Sale");
	static Department department2 = new Department(2, "Marketing");
	static Department department3 = new Department(3, "Director");
	static Department[] departments = {department1, department2, department3};
		
	
	public static void getIndex(int index) {
		System.out.println(departments[index].toString());
	}
	
	
}
