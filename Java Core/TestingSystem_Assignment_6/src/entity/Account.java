package entity;

import java.time.LocalDate;
import java.util.Scanner;

import backend.ScannerUtils;

public class Account {
	private int			accountID;
	private String		email;
	private String		userName;
	private String 		fullName;
	private Department	department;
	private Position	position;
	private LocalDate	createDate;
	private Group[] 	groups;
	private static int 		age;
	public Account() {
		super();
	}
	public Account(int accountID, String email, String userName, String fullName, Department department,
			Position position, LocalDate createDate, Group[] groups) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
		this.groups = groups;
	}
	
	public void inputAccount() {
		System.out.println("Nhập ID: ");
		accountID = ScannerUtils.inputInt("Cần là 1 số nguyên");
		System.out.println("Nhập email: ");
		email = ScannerUtils.inputString("Không được để trống");
		
	}
	Scanner scanner = new Scanner(System.in);
	public static void inputAge() {
		System.out.println("Nhập tuổi: ");
		age = ScannerUtils.inputAge();
		
	}
	
	public static void inputAge1() {
		System.out.println("Nhập tuổi: ");
		age = ScannerUtils.inputAgeGreaterThan18();
		
	}
}

