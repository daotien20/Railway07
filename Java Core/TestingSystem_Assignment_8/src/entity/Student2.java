package entity;

public class Student2 {
	private int id;
	private String name;
	
	public Student2() {
		super();
	}
	
	public Student2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + "]";
	}
	
	
}
