package entity;

public class Student4 <T>{
	private T id;
	private String name;
	public Student4(T id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student4() {
	}
	public T getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(T id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student4 [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
