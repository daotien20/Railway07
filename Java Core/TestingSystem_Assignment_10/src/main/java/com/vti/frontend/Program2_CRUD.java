package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.vti.backend.DepartmentDao;

public class Program2_CRUD {

	public static void main(String[] args) throws Exception {
//		question1();
//		question2();
//		question3();
		question4();

	}

	private static void question4() throws ClassNotFoundException, FileNotFoundException, IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n");
		System.out.println("Question 4 ===============");
		System.out.println("Nhập tên phòng ban muốn check");
		String departmentName = scanner.nextLine();
		try {
			DepartmentDao.isDepartmentNameExists(departmentName);
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
	}

	private static void question3() throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n");
		System.out.println("Question 3 ===============");
		System.out.println("Nhập id phòng ban muốn tìm");
		int id = scanner.nextInt();
		try {
			DepartmentDao.getDepartmentById(id);

		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();

		} catch (Exception e) {
			throw new Exception("Cannot find department which has id = " + id);
		}
	}

	private static void question2() throws Exception {
		System.out.println("\n");
		System.out.println("Question 2 ===============");
		try {
			DepartmentDao.getDepartmentId5();
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} catch (Exception e) {
			throw new Exception("Cannot find department which has id = 5");
		}
	}

	private static void question1() throws ClassNotFoundException, FileNotFoundException, IOException {
		System.out.println("\n");
		System.out.println("Question 1 ===============");
		try {
			DepartmentDao.getDepartments();
		} catch (SQLException e) {
		}

	}

}
