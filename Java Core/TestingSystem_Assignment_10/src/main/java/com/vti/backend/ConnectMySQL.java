package com.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class ConnectMySQL {

	public static Connection getConnection()
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resource/database.properties"));

		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		// register the driver class with DriverManager
		Class.forName(properties.getProperty("driver"));

		// Step 2: get a Database Connection
		Connection connection = DriverManager.getConnection(url, username, password);

		return connection;

	}

	public static void getPosition() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		Connection connection = getConnection();
		String sql = "SELECT * FROM position";
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
		}

		connection.close();

	}

	public static void createPosition()
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		Connection connection = getConnection();

		String sql = 	" INSERT INTO position	(position_name	)\r\n" + 
						" VALUES				( 	?			)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên position muốn tạo");
		String positionName = scanner.nextLine();

		preparedStatement.setString(1, positionName);

		int effectedRecordAmout = preparedStatement.executeUpdate();

		System.out.println("Effected Record Amount: " + effectedRecordAmout);

		connection.close();
	}

	public static void updatePosition() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {

		Connection connection = getConnection();

		String sql = 	"UPDATE position\r\n" + 
						"SET position_name = \"Dev\"\r\n" + 
						"WHERE position_id = 5";
		
		Statement statement = connection.createStatement();

		int effectedRecordAmout =  statement.executeUpdate(sql);

		System.out.println("Effected Record Amount: " + effectedRecordAmout);

		connection.close();

	}
	
	public static void deletePosition() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		Connection connection = getConnection();

		String sql =
				"DELETE \r\n" + 
				"FROM position\r\n" + 
				"WHERE position_id = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập id position muốn xoá");
		int positionId = scanner.nextInt();
		scanner.nextLine();

		preparedStatement.setInt(1, positionId);
		
		int effectedRecordAmout = preparedStatement.executeUpdate();
		System.out.println("Record deleted successfully");

		connection.close();	
	}

}
