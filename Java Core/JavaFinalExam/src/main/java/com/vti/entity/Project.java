package com.vti.entity;

import java.util.Arrays;

public class Project {
	private int projectId;
	private int teamSize;
	private Manager idManager;
	private Employee[] idEmployees;
	public Project() {
		super();
	}
	public Project(int projectId, int teamSize, Manager idManager, Employee[] idEmployees) {
		super();
		this.projectId = projectId;
		this.teamSize = teamSize;
		this.idManager = idManager;
		this.idEmployees = idEmployees;
	}
	public int getProjectId() {
		return projectId;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public Manager getIdManager() {
		return idManager;
	}
	public Employee[] getIdEmployees() {
		return idEmployees;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public void setIdManager(Manager idManager) {
		this.idManager = idManager;
	}
	public void setIdEmployees(Employee[] idEmployees) {
		this.idEmployees = idEmployees;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", teamSize=" + teamSize + ", idManager=" + idManager
				+ ", idEmployees=" + Arrays.toString(idEmployees) + ", getProjectId()=" + getProjectId()
				+ ", getTeamSize()=" + getTeamSize() + ", getIdManager()=" + getIdManager() + ", getIdEmployees()="
				+ Arrays.toString(getIdEmployees()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
