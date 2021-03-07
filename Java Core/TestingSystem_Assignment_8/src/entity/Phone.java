package entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import backend.MyMap;

public class Phone extends MyMap {
	private String keyPhone;
	private int phoneNumber;
	
	
	
	public String getKeyPhone() {
		return keyPhone;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public static Map<String, Integer> getPhones() {
		return phones;
	}

	public void setKeyPhone(String keyPhone) {
		this.keyPhone = keyPhone;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void setPhones(Map<String, Integer> phones) {
		Phone.phones = phones;
	}

	public Phone() {
		super();
	}

	public Phone(String keyPhone, int phoneNumber) {
		super();
		this.keyPhone = keyPhone;
		this.phoneNumber = phoneNumber;
	}

	static Map<String, Integer> phones = new HashMap<>();
	
	public static Phone[] inputPhone() {
		phones.put("hathu1232@gmail.com", 123456123);
		phones.put("thuyhien56@gmail.com", 101238964);
		phones.put("mn78@gmail.com", 45632589);
		
		phones.put("1", 234567890);
		phones.put("2", 123456789);
		phones.put("3", 789456120);
		
		phones.put("Hà Thu", 789456789);
		phones.put("Nguyễn Thúy Hiền", 8912456);
		phones.put("Chương Ninh", 12345789);
		return null;
	}
	
	public static void getPhoneNumbers() {
		Phone[] soDT = inputPhone();
		Iterator<Map.Entry<String, Integer>> soDTIterator = phones.entrySet().iterator();
		while (soDTIterator.hasNext()) {
		    System.out.println(soDTIterator.next().getValue());
		}
		
	}
	
	public static void getKey() {
		Phone[] soDT = inputPhone();
		Iterator<Map.Entry<String, Integer>> soDTIterator = phones.entrySet().iterator();
		while (soDTIterator.hasNext()) {
		    System.out.println(soDTIterator.next().getKey());
		}
		
	}
}
