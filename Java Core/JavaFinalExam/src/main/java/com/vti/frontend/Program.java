package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.utils.JdbcUltils;
import com.vti.utils.ScannerUtils;
import com.vti.entity.User;

public class Program {
	public static void main(String[] args)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		menuLogin();
	}

	private static void menuLogin() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Function function = new Function();
		System.out.println("MỜI BẠN LOGIN");
		User user = function.login();
		System.out.println("Login successfull!");
		System.out.println("Chào mừng " + user.getFullName() + "!");
		menuUser(user);
	}

	private static void menuUser(User user)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Function function = new Function();
		System.out.println(	"Moi ban nhap chuc nang muon su dung:\n" + 
							"1: In ra danh sách các User \n" + 
							"2: In ra danh sách các User theo Id của project\n" + 
							"3: Login\n" + 
							"4: lấy ra tất cả Manager của các project\n" + 
							"5: Thoat khoi chuong trinh\n ");

		while (true) {
			System.out.print("Moi ban nhap chuc nang: ");
			int choose = ScannerUtils.inputFunction(1, 5, "Ban chi duoc chon tu 1 --> 5. Mời nhập lại!");

			switch (choose) {
			case 1:
				function.getListUser();
				break;
			case 2:
				function.getUsersByProjectId();
				break;
			case 3:
				function.login();
				break;
			case 4:
				function.getListManagersOfProjects();
				break;
			case 5:
				System.out.println("Bạn đã thoát khỏi chương trình!");
				return;
			}
		}
	}
	
}
