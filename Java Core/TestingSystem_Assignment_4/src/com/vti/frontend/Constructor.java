package com.vti.frontend;

import java.time.LocalDate;

import com.vti.backend.AddData;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class Constructor {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		
	}


	private static void question3() {
		Account[] accounts = AddData.addAccount();
		Group[] groups = AddData.addGroup();
		
		//a
		Group group1 = new Group();
		System.out.println(group1.toString());
		
		//b
		Group group2 = new Group("Group so 2", accounts[0], LocalDate.of(2019, 06, 25), accounts);
		System.out.println(group2.toString());
		
//		//c
//		Group group3 = new Group("Group so 3", LocalDate.of(2020, 12, 25), accounts[0], usernames);
//		System.out.println(group3.toString());
	}

	private static void question2() {
		//a
		Account account1 = new Account();
		System.out.println(account1.toString());
		
		//b
		Account account2 = new Account(2, "nguyenmn@gmail.com", "nmn", "ka ", "ma", "");
		System.out.println(account2.toString());
		
		//c
		Position position1 = new Position();
		position1.setPositionID(1);
		position1.setPositionName(PositionName.SCUM_MASTER);
		
		Account account3 = new Account(3, "cuongnm@gmail.com", "cuong", "cuong", "nguyen", "", position1);
		System.out.println(account3.toString());
		
		//d
		Account account4 = new Account(4, "hkoinm@gmail.com", "hkoi", "mak", "hkoi", "", position1, LocalDate.of(2015, 06, 12));
		System.out.println(account4.toString());
	}

	private static void question1() {
		//a
		Department department1 = new Department();
		System.out.println(department1.toString());

		//b
		Department department2 = new Department("Sale");
		System.out.println(department2.toString());
	}
	



}
