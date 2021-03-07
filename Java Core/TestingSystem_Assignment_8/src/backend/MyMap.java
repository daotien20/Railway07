package backend;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import entity.Student5;

public class MyMap {
	
	static Map<Integer, String> students = new HashMap<>();
	public static Student5[] myMap() {
		students.put(12345, "Hà");
		students.put(23456, "Thu");
		students.put(78945, "Nam");
		return null;
		
	}
	
	public static void getValue() {
		Student5[] hocSinh = myMap();
		Iterator<Map.Entry<Integer, String>> studentsIterator = students.entrySet().iterator();
		while (studentsIterator.hasNext()) {
		    System.out.println(studentsIterator.next().getValue());
		}
		
	}
	
	public static void getKey() {
		Student5[] hocSinh = myMap();
		Iterator<Map.Entry<Integer, String>> studentsIterator = students.entrySet().iterator();
		while (studentsIterator.hasNext()) {
		    System.out.println(studentsIterator.next().getKey());
		}
		
	}
}
