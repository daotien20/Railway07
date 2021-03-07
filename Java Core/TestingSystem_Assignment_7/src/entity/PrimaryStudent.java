package entity;

public final class PrimaryStudent extends Student {
	public static int countPMStudent = 0;
	public PrimaryStudent(int id, String name) {
		super(id, name);
	
		countPMStudent++;
	}

}
