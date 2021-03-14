package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.utils.JdbcUltils;
import com.vti.entity.Project;
import com.vti.entity.Role;
import com.vti.entity.Manager;
import com.vti.entity.User;

public class UserRepository implements IUserRepository {

	private JdbcUltils jdbcUltils;
	private Connection connection;

	public UserRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		jdbcUltils = new JdbcUltils();
	}

	public List<User> getListUsers() throws SQLException, ClassNotFoundException {
		List<User> users = new ArrayList<User>();

		try {
			// get connect
			connection = jdbcUltils.connect();
			connection.setAutoCommit(false);

			// Step 3: Create a statment object
			Statement statement = connection.createStatement();

			// Step 4: Execute query
			String listUser = "{CALL show_all_of_users()}";
			ResultSet resultSet = statement.executeQuery(listUser);

			// Step 5: Handling result set
			while (resultSet.next()) {
				int userId = resultSet.getInt(1);
				String fullName = resultSet.getString(2);
				String email = resultSet.getString(3);
				String password = resultSet.getString(4);

				Role role = Role.valueOf(resultSet.getString(5).toUpperCase());

				User user = new User(userId, fullName, email, password, role);
				users.add(user);

			}
			System.out.println("users");
			return users;
		} finally {
			// Step 6: Close connection
			connection.close();
		}

	}

	public List<User> getUsersByProjectId(int id) throws SQLException, ClassNotFoundException {
		List<User> users = new ArrayList<User>();
		try {
			// Step 2: get connect
			connection = jdbcUltils.connect();

			// Step 3: Create a statement object
			String sql = "{CALL show_users_of_project(?)}";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// set parameter
			preparedStatement.setInt(1, id);

			// Step 4: Execute SQL query
			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result set
			while (resultSet.next()) {
				int userId = resultSet.getInt(2);
				String fullName = resultSet.getString(3);
				String email = resultSet.getString(4);
				String password = resultSet.getString(5);

				Role role = Role.valueOf(resultSet.getString(6).toUpperCase());

				User user = new User(userId, fullName, email, password, role);
				users.add(user);
			}
			System.out.println("users");
			return users;

		} finally {
			connection.close();
		}
	}

	public List<Manager> getManagersOfProjects() throws SQLException, ClassNotFoundException {
		List<Manager> managers = new ArrayList<Manager>();

		try {
			// get connect
			connection = jdbcUltils.connect();
			connection.setAutoCommit(false);

			// Step 3: Create a statment object
			Statement statement = connection.createStatement();

			// Step 4: Execute query
			String listUser = "SELECT DISTINCT manager_id, full_name, email, `password`, exp_in_year, `role` FROM project\r\n"
					+ "JOIN manager USING (manager_id)";
			ResultSet resultSet = statement.executeQuery(listUser);

			// Step 5: Handling result set
			while (resultSet.next()) {
				int userId = resultSet.getInt(1);
				String fullName = resultSet.getString(2);
				String email = resultSet.getString(3);
				String password = resultSet.getString(4);
				int expInYear = resultSet.getInt(5);

				Role role = Role.valueOf(resultSet.getString(6).toUpperCase());

				Manager manager = new Manager(userId, fullName, email, password, expInYear, role);
				managers.add(manager);

			}
			System.out.println("managers");
			return managers;
		} finally {
			// Step 6: Close connection
			connection.close();
		}

	}

	public boolean isProjectIdExits(int id) throws SQLException, ClassNotFoundException {
		try {

			// step 2: get connect
			connection = jdbcUltils.connect();

			// Step 3: Create a statement object

			String sql = "SELECT * FROM project\r\n" + "WHERE project_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// set parameter
			preparedStatement.setInt(1, id);

			// Step 4: Execute Query
			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result set

			if (resultSet.next()) {

				return true;
			}

			return false;
		} finally {
			connection.close();
		}

	}

	public User login(String email, String password) throws Exception {
		try {

			// step 2: get connect
			connection = jdbcUltils.connect();

			// Step 3: Create a statement object

			String sql = "{CALL log_in(?,?)}";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// set parameter
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);

			// Step 4: Execute Query

			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result
			if (resultSet.next()) {
				int userId = resultSet.getInt("user_id");
				String fullName = resultSet.getString("full_name");

				Role role = Role.valueOf(resultSet.getString("role").toUpperCase());

				User user = new User(userId, fullName, email, password, role);
				return user;
			} else {
				throw new Exception("Tài khoản hoặc mật khẩu sai!");
			}

		} finally {
			connection.close();
		}
	}

}
