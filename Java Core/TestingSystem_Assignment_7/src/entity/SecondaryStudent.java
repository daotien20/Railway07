package entity;

public final class SecondaryStudent extends Student{
	public static int countSCStudent = 0;
	public SecondaryStudent(int id, String name) {
		super(id, name);
		
		countSCStudent++;
	}

}
