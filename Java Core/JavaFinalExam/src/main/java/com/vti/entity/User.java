package com.vti.entity;

public class User {

	private int id;
	private String FullName;
	private String Email;
	private String Password;
	private Role role;

	public User(int id, String fullName, String email, String password, Role role) {
		super();
		this.id = id;
		this.FullName = fullName;
		this.Email = email;
		this.Password = password;
		this.role = role;
	}

	public User(int id2, String fullName2) {
	}

	

	public User(int userId, String fullName2, String email2, String password2, int expInYear, Role role2) {
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return FullName;
	}

	public String getEmail() {
		return Email;
	}

	public String getPassword() {
		return Password;
	}

	public Role getRole() {
		return role;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", FullName=" + FullName + ", Email=" + Email + ", Password=" + Password + "]";
	}



	

	

}
