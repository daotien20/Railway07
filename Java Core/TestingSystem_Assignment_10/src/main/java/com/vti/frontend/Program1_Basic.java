package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.vti.backend.ConnectMySQL;

public class Program1_Basic {

	public static void main(String[] args)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		ConnectMySQL.getConnection();
		ConnectMySQL.getConnection().setAutoCommit(false);

//		question1();
//		question2();
//		question3();
//		question4();
//		question5();

	}

	private static void question5() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		System.out.println("\n");
		System.out.println("Question 5 ===============");
		try {
			ConnectMySQL.deletePosition();
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} catch (Exception e) {
			System.out.println("Id này không tồn tại!");
		}
	}

	private static void question4() {
		System.out.println("\n");
		System.out.println("Question 4 ===============");
		try {
			ConnectMySQL.updatePosition();
		} catch (Exception e) {
			System.out.println("Vị trí này đã tồn tại, không thể update tên cho id này");
		}
	}

	private static void question3() {
		System.out.println("\n");
		System.out.println("Question 3 ===============");
		try {
			ConnectMySQL.createPosition();
		} catch (Exception e) {
			System.out.println("Tên vị trí này đã có!");
		}
	}

	private static void question2() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		System.out.println("\n");
		System.out.println("Question 2 ===============");
		ConnectMySQL.getPosition();
	}

	private static void question1() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		System.out.println("Question 1 ===============");
		System.out.println("Connect success!");

	}

}
