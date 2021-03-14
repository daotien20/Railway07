package com.vti.backend.presentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.bussinesslayer.IUserService;
import com.vti.backend.bussinesslayer.UserService;
import com.vti.entity.Manager;
import com.vti.entity.Project;
import com.vti.entity.User;

public class UserController {
	private static IUserService userService;

	public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userService = new UserService();
	}

	public List<User> getListUsers() throws SQLException, ClassNotFoundException {

		return userService.getListUsers();
	}

	public List<User> getUsersByProjectId(int id) throws SQLException, ClassNotFoundException {
		return userService.getUsersByProjectId(id);
	}
	
	public List<Manager> getManagersOfProjects () throws SQLException, ClassNotFoundException {
		return userService.getManagersOfProjects();
	}


	public boolean isProjectIdExits(int id) throws SQLException, ClassNotFoundException {
		return userService.isProjectIdExits(id);
	}

	public static User login(String email, String password) throws Exception {
		return userService.login(email, password);
	}

}
