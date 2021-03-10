package com.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DepartmentDao {
	public static boolean isDepartmentNameExists(String name)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		ConnectMySQL.getConnection();
		ConnectMySQL.getConnection().setAutoCommit(false);
		String sql = "SELECT * FROM department WHERE department_name = ?";
		PreparedStatement preStatement = ConnectMySQL.getConnection().prepareStatement(sql);
		preStatement.setString(1, name);
		ResultSet resultSet = preStatement.executeQuery();

		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			ConnectMySQL.getConnection().close();
		}
		if (resultSet.getString(2).equals(name)) {
			return true;
		} else {
			return false;
		}
	}

	public static void getDepartmentById(int id)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		ConnectMySQL.getConnection();
		ConnectMySQL.getConnection().setAutoCommit(false);

		String sql = "SELECT * FROM department\r\n" + "WHERE department_id = ?";
		PreparedStatement preparedStatement = ConnectMySQL.getConnection().prepareStatement(sql);
		preparedStatement.setInt(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
		}
		ConnectMySQL.getConnection().close();

	}

	public static void getDepartmentId5()
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		ConnectMySQL.getConnection();
		ConnectMySQL.getConnection().setAutoCommit(false);

		String sql = "SELECT * FROM department\r\n" + "WHERE department_id = 5";
		Statement statement = ConnectMySQL.getConnection().createStatement();

		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
		}

		ConnectMySQL.getConnection().close();

	}

	public static void getDepartments()
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		ConnectMySQL.getConnection();
		ConnectMySQL.getConnection().setAutoCommit(false);

		String sql = "SELECT * FROM department\r\n" + "ORDER BY department_id";
		Statement statement = ConnectMySQL.getConnection().createStatement();

		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
		}

		ConnectMySQL.getConnection().close();
	}
}
