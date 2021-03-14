package com.vti.backend.bussinesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.entity.Project;
import com.vti.entity.User;

public interface IUserService {
	List<User> getListUsers() throws SQLException, ClassNotFoundException;

	List<User> getUsersByProjectId(int id) throws SQLException, ClassNotFoundException;
	
	List<Manager> getManagersOfProjects () throws SQLException, ClassNotFoundException;

	boolean isProjectIdExits(int id) throws SQLException, ClassNotFoundException;

	User login(String email, String password) throws Exception;

}
