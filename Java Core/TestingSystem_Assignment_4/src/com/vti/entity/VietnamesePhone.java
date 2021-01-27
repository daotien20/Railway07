package com.vti.entity;

import com.vti.backend.IAbstract;

public class VietnamesePhone extends Phone implements IAbstract{
	@Override
	public void insertContact(String name, String phone) {
		System.out.println("Insert Contact with Name: " + name + " & Phone: " + phone);	
	}
	@Override
	public void removeContact(String name) {
		System.out.println("Remove Contact with Name: " + name);
	}
	@Override
	public void updateContact(String name, String newPhone) {
		System.out.println("Update Contact with Name: " + name + " & New Phone: " + newPhone);	
	}
	@Override
	public void searchContact(String name) {
		System.out.println("Search Contact with Name: " + name);
	}
}
