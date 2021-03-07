package entity;

public class Student5 {
	private int maSinhVien;
	private String name;
	public Student5(int maSinhVien, String name) {
		super();
		this.maSinhVien = maSinhVien;
		this.name = name;
	}
	public Student5() {
		super();
	}
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public String getName() {
		return name;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student5 [maSinhVien=" + maSinhVien + ", name=" + name + "]";
	}
	
	
}
