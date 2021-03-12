package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.vti.backend.ConnectMySQL;
import com.vti.backend.DepartmentDao;

public class Program2_CRUD {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
//		question7();
//		exercise3();
//		exercise4();

	}

	private static void exercise4() throws ClassNotFoundException, FileNotFoundException, IOException, SQLException {
		System.out.println("\n");
		System.out.println("Question 8 ===============");
		Connection connection = ConnectMySQL.getConnection();
		connection.setAutoCommit(false);
		try {
			DepartmentDao.transaction(connection);
			connection.commit();
			System.out.println("Transaction Commit!");

		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
			connection.rollback();
			System.out.println("Transaction Rollback!");
		}
		connection.setAutoCommit(true);
		connection.close();
		
	}

	private static void exercise3() throws ClassNotFoundException, FileNotFoundException, IOException {
		System.out.println("\n");
		System.out.println("Question 7 ===============");
		try {
			System.out.println("Nhập id phòng ban muốn delete");
			int id = scanner.nextInt();
			scanner.nextLine();

			DepartmentDao.deleteDepartmentUsingProcedure(id);

		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
	}

	private static void question7() throws ClassNotFoundException, FileNotFoundException, IOException {
		System.out.println("\n");
		System.out.println("Question 6 ===============");
		try {
			System.out.println("Nhập id phòng ban muốn delete");
			int id = scanner.nextInt();
			scanner.nextLine();

			DepartmentDao.deleteDepartment(id);

		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
	}

	private static void question6() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		System.out.println("\n");
		System.out.println("Question 6 ===============");
		try {
			System.out.println("Check id phòng ban muốn update");
			int departmentId = scanner.nextInt();
			DepartmentDao.isDepartmentIdExists(departmentId);
			scanner.nextLine();

			System.out.println("\n");
			System.out.println("Check tên phòng ban muốn update");
			String departmentName = scanner.nextLine();
			DepartmentDao.isDepartmentNameExists(departmentName);

			System.out.println("\n");
			System.out.println("Nhập id phòng ban muốn update");
			int id = scanner.nextInt();
			scanner.nextLine();

			System.out.println("\n");
			System.out.println("Nhập tên phòng ban muốn update");
			String newName = scanner.nextLine();
			DepartmentDao.updateDepartmentName(id, newName);

		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
	}

	private static void question5() throws Exception {
		System.out.println("\n");
		System.out.println("Question 5 ===============");
		System.out.println("Nhập tên department muốn tạo");
		String departmentName = scanner.nextLine();
		try {
			DepartmentDao.createDepartment(departmentName);
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
	}

	private static void question4() throws ClassNotFoundException, FileNotFoundException, IOException {
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
