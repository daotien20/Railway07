package entity;

public class Student3 implements Comparable<Student3> {
	private int id;
	private String name;
	private String ngaySinh;
	private float diem;

	public Student3(int id, String name, String ngaySinh, float diem) {
		super();
		this.id = id;
		this.name = name;
		this.ngaySinh = ngaySinh;
		this.diem = diem;
	}

	public Student3() {
		super();
	}

	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", ngaySinh=" + ngaySinh + ", diem=" + diem + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public float getDiem() {
		return diem;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public void setDiem(float diem) {
		this.diem = diem;
	}

	@Override
	public int compareTo(Student3 other) {
		if (name.compareTo(other.name) > 0) {
			return 1;
		}

		if (name.compareTo(other.name) < 0) {
			return -1;
		}
		
		if(ngaySinh.compareTo(other.ngaySinh) > 0) {
			return 1;
		} 
		
		if(ngaySinh.compareTo(other.ngaySinh) < 0) {
			return -1;
		}	
		
		if(diem > other.diem) {
			return 1;
		} 
		
		if(diem < other.diem) {
			return -1;
		}
		
		
		return 0;	
		}

}
