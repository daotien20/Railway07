package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.PrimaryStudent;
import entity.SecondaryStudent;
import entity.Student;

public class BeStudent {
	public void question1() {
		Student student1 = new Student(1, "Nguyễn Văn A");
		Student student2 = new Student(2, "Nguyễn Văn B");
		Student student3 = new Student(3, "Nguyễn Văn C");
		Student[] students = { student1, student2, student3 };
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}

		Student.setCollege("Đại học công nghệ");
		System.out.println("");
		for (int a = 0; a < students.length; a++) {
			System.out.println(students[a].toString());
		}

	}

	public void question2() {
		Scanner scanner = new Scanner(System.in);
		Student student1 = new Student(1, "Nguyễn Văn A");
		Student student2 = new Student(2, "Nguyễn Văn B");
		Student student3 = new Student(3, "Nguyễn Văn C");
		Student[] students = { student1, student2, student3 };

		System.out.println("Mỗi student nộp quỹ 100k");
		Student.moneyGroup = students.length * 100000;
		System.out.println("Tổng quỹ = " + Student.moneyGroup);

		System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan");
		Student.moneyGroup = Student.moneyGroup - 50000;
		System.out.println("Quỹ còn: " + Student.moneyGroup);
		System.out.println("Student thứ 2 lấy 20k đi mua bánh mì");
		Student.moneyGroup = Student.moneyGroup - 20000;
		System.out.println("Quỹ còn: " + Student.moneyGroup);
		System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm");
		Student.moneyGroup = Student.moneyGroup - 150000;
		System.out.println("Quỹ còn: " + Student.moneyGroup);

		System.out.println("Cả nhóm mỗi người lại đóng quỹ mỗi người 50k");
		Student.moneyGroup = Student.moneyGroup + students.length * 50000;

		System.out.println("Tổng quỹ = " + Student.moneyGroup);

//		for(Student hocsinh: students) {
//			System.out.println(hocsinh.getName() + " nộp số tiền = ");
//			Student.moneyGroup = Student.moneyGroup + scanner.nextInt();
//		}
//		
//		System.out.println("Tổng quỹ = " +  Student.moneyGroup);	

	}

	public void question4() {
		Student.changeCollege();
		Student.showCollege();
	}

	public Student[] question5() {
		Scanner scanner = new Scanner(System.in);
		Student student1 = new Student(1, "Nguyễn Văn A");
		Student student2 = new Student(2, "Nguyễn Văn B");
		Student student3 = new Student(3, "Nguyễn Văn C");
		Student[] students = { student1, student2, student3 };
		for (int a = 0; a < students.length; a++) {
			System.out.println(students[a].toString());
		}
		System.out.println("Số học sinh: " + Student.count);
		return students;
	}

	public void question6() {
		Student[] students = question5();
		PrimaryStudent pmStudent1 = new PrimaryStudent(1, "Xuân");
		PrimaryStudent pmStudent2 = new PrimaryStudent(2, "Hạ");
		PrimaryStudent[] pmStudents = { pmStudent1, pmStudent2 };
		System.out.println("Số học sinh cấp 1: " + PrimaryStudent.countPMStudent);

		SecondaryStudent scStudent1 = new SecondaryStudent(1, "Hà");
		SecondaryStudent scStudent2 = new SecondaryStudent(2, "Kiên");
		SecondaryStudent scStudent3 = new SecondaryStudent(3, "Thu");
		SecondaryStudent scStudent4 = new SecondaryStudent(4, "Hiền");
		SecondaryStudent[] scStudents = { scStudent1, scStudent2, scStudent3, scStudent4 };
		System.out.println("Số học sinh cấp 2: " + SecondaryStudent.countSCStudent);

		System.out.println("Tổng số học sinh: " + Student.count);
	}

	public void question7() throws Exception {
		Scanner scanner = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		while (true) {
			if (students.size() >=7) {
				throw new Exception("Đã thêm quá 7 học sinh");
			} else {
				Student student1 = new Student();
				System.out.println("Nhập Id: ");
				student1.setId(scanner.nextInt());
				scanner.nextLine();
				System.out.println("Nhập tên: ");
				student1.setName(scanner.nextLine());
				
				students.add(student1);
				if (students.size() >=7) {
					throw new Exception("Đã thêm quá 7 học sinh");
				}else {
					System.out.println("Tiếp tục thêm học sinh?");
					System.out.println("1: Có; 2: Không");
					int x = scanner.nextInt();
					scanner.nextLine();
	
					if (x == 1) {
						continue;
	
					} else {
						System.out.println("Thêm học sinh đã xong");
						break;
					}
				}
			}
		}
	}
}
