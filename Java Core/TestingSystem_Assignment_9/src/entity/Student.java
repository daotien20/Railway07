package entity;

public class Student {
	private int id;
	private String name;
	private static int count = 1;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = count++;
		this.name = name;
	}
	public Student() {
		super();
		this.id = count++;
	}
	
	
	
}
