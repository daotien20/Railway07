package entity;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private static int id;
	private static String name;
	private Salary[] salaries;
	
	static List<Salary> listSalary = new ArrayList<>();
	static List<Employee> listEmployee = new ArrayList<Employee>();
	
	public Employee(int id, String name, Salary[] salaries) {
		super();
		this.id = id;
		this.name = name;
		this.salaries = salaries;
	}



	public static int getId() {
		return id;
	}



	public static String getName() {
		return name;
	}



	public Salary[] getSalaries() {
		return salaries;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setSalaries(Salary[] salaries) {
		this.salaries = salaries;
	}



	public Employee() {
		super();
	}



	public static void showEmployee() {
		System.out.println("ID: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Lương: " + listSalary.toString());
	}
	
	public static void thangluongCuoiCung() {
		for(Employee nhanVien : listEmployee) {
			System.out.println(nhanVien.getName());
			System.out.println("Lương tháng cuối cùng: " + (listSalary.size()-1));
		}
		
	}
}
