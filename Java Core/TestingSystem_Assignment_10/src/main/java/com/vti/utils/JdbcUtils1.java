package com.vti.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.vti.backend.ConnectMySQL;

public class JdbcUtils1 {
	public static void isConnectedForTesting() {
		try {
			ConnectMySQL.getConnection();
			System.out.println("Connect success!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static Connection connect() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resource/database.properties"));

		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		Class.forName(properties.getProperty("driver"));

		Connection connection = DriverManager.getConnection(url, username, password);

		return connection;
		
	}
	
	public static void disconnect() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		ConnectMySQL.getConnection().close();
	}

}
