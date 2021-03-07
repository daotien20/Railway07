package entity;

import backend.ScannerUtils;

public class Department {
	
	private int id;
	private String name;
	
	

	public Department(int id, String departmentName) {
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + name + "]";
	}
	
	public Department() {
		name = inputName();
		id = inputID();
	}

	private String inputName() {
		System.out.println("Mời bạn nhập vào tên phòng ban: ");
		String nameDepartment = ScannerUtils.inputString("Nhập sai! Nhập lại! ");
		return nameDepartment;
	}
	
	private int inputID() {
		System.out.println("Mời bạn nhập vào ID của phòng ban: ");
		int idDepartment = ScannerUtils.inputInt("Nhập sai, Nhập lại");
		return idDepartment;
		
	}
	

}
