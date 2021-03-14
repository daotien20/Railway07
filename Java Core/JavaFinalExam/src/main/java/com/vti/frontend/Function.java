package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.utils.ScannerUtils;
import com.vti.backend.presentation.UserController;
import com.vti.entity.Manager;
import com.vti.entity.User;

public class Function {

	private UserController userController;

	public Function() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userController = new UserController();
	}

	public void getListUser() throws ClassNotFoundException, SQLException {
		List<User> users = userController.getListUsers();
		System.out.printf("%-15s %-25s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Password", "Role");
		for (User user : users) {
			System.out.printf("%-15s %-25s %-25s %-25s %-25s\n", user.getId(), user.getEmail(), user.getFullName(),
					"*********", user.getRole());
		}
	}

	public void getUsersByProjectId() throws ClassNotFoundException, SQLException {
		
		while (true) {
			System.out.print("Mời bạn nhập vào id: ");
			int id = ScannerUtils.inputPositiveInt("Bạn phải nhập vào số nguyên dương! Mời nhập lại");

			if (userController.isProjectIdExits(id)) {
				List<User> users = userController.getUsersByProjectId(id);
				System.out.printf("%-15s %-25s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Password", "Role");
				for (User user : users) {
					System.out.printf("%-15s %-25s %-25s %-25s %-25s\n", user.getId(), user.getEmail(),
							user.getFullName(), "*********", user.getRole());
				}
				return;
			} else {
				System.err.println("id không tồn tại! vui lòng nhập lại! ");
			}
		}
	}

	public void getListManagersOfProjects() throws ClassNotFoundException, SQLException {
		List<Manager> managers = userController.getManagersOfProjects();
		System.out.printf("%-15s %-25s %-25s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Password", "Exp_In_Year", "Role");
		for (Manager manager : managers) {
			System.out.printf("%-15s %-25s %-25s %-25s %-25s %-25s\n", manager.getId(), manager.getEmail(), manager.getFullName(),
					"*********", manager.getExpInYear() , manager.getRole());
		}
	
}
	public User login() throws ClassNotFoundException, SQLException {
		while (true) {
			System.out.print("Mời bạn nhập vào Email của user: ");
			String email = ScannerUtils.inputEmail("Email chưa đúng định dạng.");

			System.out.print("Mời bạn nhập password: ");
			String password = ScannerUtils
					.inputPassword("Password phai dai tu 6--> 12 ki tu va co it nhat 1 chu viet hoa!");
			try {
				return userController.login(email, password);

			} catch (Exception e) {
				System.err.println(e.getMessage() + "\n");
			}
		}
	}
}
