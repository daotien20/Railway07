package entity;

import backend.BeEx2Q1_IStudent;

public class Ex2Q1_Student implements BeEx2Q1_IStudent{
	private int	id;
	private String	name;
	private int	group;
	
	public Ex2Q1_Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGroup() {
		return group;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public Ex2Q1_Student(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}

	@Override
	public void diemDanh() {
		System.out.println(getName() + " điểm danh");		
	}

	@Override
	public void hocBai() {
		System.out.println(getName() + " đi học bài");		
	}

	@Override
	public void diDonVeSinh() {
		System.out.println(getName() + " đi dọn vệ sinh");			
	}

	
	
}	
