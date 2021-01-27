package com.vti.entity;

public class Account1 {
	private String id;
	private String name;
	private int balance;
	
	
	public Account1(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getBalance() {
		return balance;
	}
	
	public int credit (int amount) {
		return amount;
	}
	
	public int debit (int amount) {
		return amount;
		
	}
	
	public void tranferTo(Account1 account, int mount) {
		System.out.println("Transfer "  + account + " to " + account.getName());
	}
}
