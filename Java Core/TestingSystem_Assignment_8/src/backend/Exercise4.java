package backend;

import entity.Ex4_Salary;

public class Exercise4 {
	public static <T> void question3() {
		int maxInt = MyMath.max(5, 7, 9);
		System.out.println(maxInt);

		float maxFloat = MyMath.max(5.6f, 9f, 11.32f);
		System.out.println(maxFloat);
		
		double maxDouble = MyMath.max(9.67, 89.1, 10.457);
		System.out.println(maxDouble);
	}
	
	public static void question1() {
		Ex4_Salary<Integer> salary = new Ex4_Salary<Integer>(123456);
		System.out.println(salary);
	}
}
