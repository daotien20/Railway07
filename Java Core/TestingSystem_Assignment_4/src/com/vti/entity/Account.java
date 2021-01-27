package com.vti.entity;

import java.time.LocalDate;

public class Account {
	private int accountID;
	private String email;
	private String userName;
	private String fullName;
	private Department department;
	private PositionName position;
	private LocalDate createDate;
	private Group[] groups;


	public Account() {
		super();
	}
	
	public Account(int accountID, String email, String userName, String firstName, String lastName, String fullName) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
	}

	public Account(int accountID, String email, String userName, String firstName, String lastName, String fullName,
			Position position) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName =  firstName + lastName;
		this.setPosition(position.getPositionName());
		this.createDate = LocalDate.now();
	}

	public Account(int accountID, String email, String userName, String firstName, String lastName, String fullName,
			Position position, LocalDate createDate) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
		this.setPosition(position.getPositionName());
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName + ", position=" + getPosition() + ", createDate=" + createDate + "]";
	}

	public int getAccountID() {
		return accountID;
	}

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getFullName() {
		return fullName;
	}

	public Department getDepartment() {
		return department;
	}

	public PositionName getPosition() {
		return position;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setPosition(Position position) {
		this.position = position.getPositionName();
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	public void setPosition(PositionName position) {
		this.position = position;
	}
	
	
	
	
	
}
