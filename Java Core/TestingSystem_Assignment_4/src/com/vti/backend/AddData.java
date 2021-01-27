package com.vti.backend;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class AddData {
	public static Department[] addDepartment() {
		Department department1 = new Department();
		department1.setDepartmentID(1);
		department1.setDepartmentName("Sale");

		Department department2 = new Department();
		department2.setDepartmentID(2);
		department2.setDepartmentName("Marketing");

		Department department3 = new Department();
		department3.setDepartmentID(3);
		department3.setDepartmentName("Test");
		
		Department departments[] = {department1,department2,department3};
		
		return departments;
	}
	
	public static Position[] addPosition() {
		Position position1 = new Position();
		position1.setPositionID(1);
		position1.setPositionName(PositionName.DEV);

		Position position2 = new Position();
		position2.setPositionID(2);
		position2.setPositionName(PositionName.PM);

		Position position3 = new Position();
		position3.setPositionID(3);
		position3.setPositionName(PositionName.SCUM_MASTER);
		
		Position positions[]= {position1,position2,position3};
		
		return positions;
	}
	
	public static Account[] addAccount() {
		Department[] departments = addDepartment();
		Position[] positions = addPosition();
//		Group[] groups = addGroup();
		
		Account account1 = new Account();
		account1.setAccountID(1);
		account1.setEmail("cuongnm@gmail.com");
		account1.setUserName("cuongnm");
		account1.setFullName("nguyen cuong");
		account1.setDepartment(departments[1]);
		account1.setPosition(positions[2]);
		account1.setCreateDate(LocalDate.of(2019, 12, 23));

		Account account2 = new Account();
		account2.setAccountID(2);
		account2.setEmail("hoangvanthu@gmail.com");
		account2.setUserName("hoangvanthu");
		account2.setFullName("hoang van thu");
		account2.setDepartment(departments[0]);
		account2.setPosition(positions[1]);
		account2.setCreateDate(LocalDate.of(2019, 12, 23));

		Account account3 = new Account();
		account3.setAccountID(2);
		account3.setEmail("nguyenchienthang@gmail.com");
		account3.setUserName("nguyenc");
		account3.setFullName("nguyen chien thang");
		account3.setDepartment(departments[2]);
		account3.setPosition(positions[1]);
		account3.setCreateDate(LocalDate.of(2019, 12, 23));
		
//		Group[] groupsOfAccount1 = { groups[0], groups[1] };
//		account1.groups = groupsOfAccount1;
//
//		Group[] groupsOfAccount2 = { groups[1], groups[2] };
//		account2.groups = groupsOfAccount2;
//
//		Group[] groupsOfAccount3 = { groups[0], groups[2] };
//		account3.groups = groupsOfAccount3;
//		
		Account[] accounts = {account1,account2,account3};
		
		return accounts;
	}
	
	public static Group[] addGroup() {
		Account[] accounts = addAccount();
		
		Group group1 = new Group();
		group1.setGroupID(1);
		group1.setGroupName("group so 1");
		group1.setCreator(accounts[0]);
		group1.setCreateDate(LocalDate.of(2019, 12, 25));

		Group group2 = new Group();
		group2.setGroupID(2);
		group2.setGroupName("group so 2");
		group2.setCreator(accounts[2]);
		group2.setCreateDate(LocalDate.of(2019, 12, 25));

		Group group3 = new Group();
		group3.setGroupID(3);
		group3.setGroupName("group so 3");
		group3.setCreator(accounts[1]);
		group3.setCreateDate(LocalDate.of(2019, 12, 25));

//		Account[] accountsOfGroup1 = { accounts[0], accounts[2] };
//		group1.accounts = accountsOfGroup1;
//
//		Account[] accountsOfGroup2 = { accounts[0], accounts[1] };
//		group2.accounts = accountsOfGroup2;
//
//		Account[] accountsOfGroup3 = { accounts[1], accounts[2] };
//		group3.accounts = accountsOfGroup3;
		
		Group[] groups = {group1,group2,group3};
		
		return groups;
	}
	
	
}
