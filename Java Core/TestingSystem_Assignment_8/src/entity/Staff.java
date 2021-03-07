package entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import backend.MyMap;

public class Staff<T> extends MyMap{
	
	static Map<Integer, String> staff = new HashMap<>();
	public static StaffT[] staff() {
		staff.put(1, "Hà");
		staff.put(2, "Thu");
		staff.put(3, "Nam");
		return null;
	}
	
	public static void getName() {
		StaffT[] staffs = staff();
		Iterator<Map.Entry<Integer, String>> staffsIterator = staff.entrySet().iterator();
		while (staffsIterator.hasNext()) {
		    System.out.println(staffsIterator.next().getValue());
		}
		
	}
	
	public static void getID() {
		StaffT[] staffs = staff();
		Iterator<Map.Entry<Integer, String>> staffsIterator = staff.entrySet().iterator();
		while (staffsIterator.hasNext()) {
		    System.out.println(staffsIterator.next().getKey());
		}
		
	}
	
}
