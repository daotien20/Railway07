package com.vti.entity;
import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	private int groupID;
	private String groupName;
	private Account creator;
	private LocalDate createDate;
	Account[] accounts;
	public int getGroupID() {
		return groupID;
	}
	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Account getCreator() {
		return creator;
	}
	public void setCreator(Account creator) {
		this.creator = creator;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
	public Group(String groupName, LocalDate createDate, Account creator, String[] usernames ) {
		super();
		this.groupName = groupName;
		this.createDate = createDate;
		this.creator = creator;
	}


	public Group(String groupName, Account creator, LocalDate createDate, Account[] accounts) {
		super();
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}
	

	public Group() {
		super();
	}


	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupName=" + groupName + ", creator=" + creator + ", createDate="
				+ createDate + ", accounts=" + Arrays.toString(accounts) + "]";
	}
}
