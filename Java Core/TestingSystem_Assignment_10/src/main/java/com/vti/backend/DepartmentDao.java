package com.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
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
	public static void transaction(Connection connection) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		ConnectMySQL.getConnection();
		ConnectMySQL.getConnection().setAutoCommit(false);

		String sql = "DELETE \r\n" + "FROM `account`\r\n" + "WHERE department_id = 3";

		PreparedStatement preparedStatement = ConnectMySQL.getConnection().prepareStatement(sql);

		int effectedRecordAmout = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmout);
	}

	public static void deleteDepartmentUsingProcedure(int id)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		ConnectMySQL.getConnection();
		ConnectMySQL.getConnection().setAutoCommit(false);

		String sql = "{CALL sp_delete_department(?)}";
		CallableStatement callableStatement = ConnectMySQL.getConnection().prepareCall(sql);

		if (isDepartmentIdExists(id) != false) {
			callableStatement.setInt(1, id);
			int effectedRecordAmout = callableStatement.executeUpdate();
			System.out.println("Effected Record Amount: " + effectedRecordAmout);
		} else {
			System.out.println("Cannot find department which has id = " + id);
		}

	}

	public static void deleteDepartment(int id)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		ConnectMySQL.getConnection();
		ConnectMySQL.getConnection().setAutoCommit(false);

		String sql = "DELETE \r\n" + "FROM department\r\n" + "WHERE department_id = ?";

		PreparedStatement preparedStatement = ConnectMySQL.getConnection().prepareStatement(sql);

		if (isDepartmentIdExists(id) != false) {
			preparedStatement.setInt(1, id);
			int effectedRecordAmout = preparedStatement.executeUpdate();
			System.out.println("Effected Record Amount: " + effectedRecordAmout);
		} else {
			System.out.println("Cannot find department which has id = " + id);
		}
	}

	public static void updateDepartmentName(int id, String newName)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		ConnectMySQL.getConnection();
		ConnectMySQL.getConnection().setAutoCommit(false);

		String sql = "UPDATE department\r\n" + "SET department_name = ? \r\n" + "WHERE department_id = ?";

		PreparedStatement preparedStatement = ConnectMySQL.getConnection().prepareStatement(sql);

		preparedStatement.setString(1, newName);
		preparedStatement.setInt(2, id);
		int effectedRecordAmout = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmout);
	}

	public static boolean isDepartmentIdExists(int id)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		boolean result = false;

		ConnectMySQL.getConnection();
		ConnectMySQL.getConnection().setAutoCommit(false);

		String sql = "SELECT * FROM department WHERE department_id = ?";
		PreparedStatement preStatement = ConnectMySQL.getConnection().prepareStatement(sql);
		preStatement.setInt(1, id);
		ResultSet resultSet = preStatement.executeQuery();
		while (resultSet.next()) {
			if (resultSet.getInt("department_id") != id) {
				System.out.println("Cannot find department which has id = " + id);
				result = false;
			} else {
				System.out.println("Id này tồn tại. Thông tin department là: ");
				getDepartmentById(id);
				result = true;
			}
		}
		System.out.println(result);
		return result;
	}

	public static void createDepartment(String departmentName)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		ConnectMySQL.getConnection();
		ConnectMySQL.getConnection().setAutoCommit(false);
		isDepartmentNameExists(departmentName);

		String sql = " INSERT INTO department	(department_name	)\r\n"
				+ " VALUES					( 	?			)";
		PreparedStatement preparedStatement = ConnectMySQL.getConnection().prepareStatement(sql);

		if (isDepartmentNameExists(departmentName) != false) {
			System.out.println("Department Name is Exists!");
		} else {
			preparedStatement.setString(1, departmentName);
			int effectedRecordAmout = preparedStatement.executeUpdate();
			System.out.println("Effected Record Amount: " + effectedRecordAmout);
		}
		ConnectMySQL.getConnection().close();
	}

	public static boolean isDepartmentNameExists(String name)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		boolean result = false;

		ConnectMySQL.getConnection();
		ConnectMySQL.getConnection().setAutoCommit(false);

		String sql = "SELECT * FROM department WHERE department_name = ?";
		PreparedStatement preStatement = ConnectMySQL.getConnection().prepareStatement(sql);
		preStatement.setString(1, name);
		ResultSet resultSet = preStatement.executeQuery();

		while (resultSet.next()) {
			if (resultSet.getString("department_name").equals(name)) {
				result = true;
			} else {
				result = false;
			}
		}

		System.out.println(result);
		return result;

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
			System.out.println("ID: " + resultSet.getInt(1));
			System.out.println("Tên department: " + resultSet.getString(2));
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
