package frontend;

import entity.Student;

public class Ex2Q2_Annotations {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Nguyễn Văn A");
		System.out.println(student.getName());
		printStudentID(student);
		printStudentIDV2(student);
	}
	/**
	 * @deprecated replaced by {@link #printStudentV2(Student)}}
	 */
	@Deprecated
	public static void printStudentID(Student student) {
		System.out.println(student.getId());
		
	}
	
	public static void printStudentIDV2(Student student) {
		System.out.println( "MSV: " + student.getId());
	}

}
