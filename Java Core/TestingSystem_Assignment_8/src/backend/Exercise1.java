package backend;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import entity.Student;
import entity.Student2;

public class Exercise1 {
	static List<Student> listStudent = new ArrayList<Student>();
	static List<Student> listStudent2 = new ArrayList<Student>();
	static List<Student> studentCopies = new ArrayList<Student>();
	static Stack<Student> stackStudents = new Stack<Student>();
	static Queue<Student> queueStudents = new LinkedList<>();
	static Set<Student2> setStudents = new HashSet<>();
	static Map<Integer, String> mapStudents = new HashMap<>();
	static Scanner scanner = new Scanner(System.in);

	public static void question7() {
		Student[] students = question6();
		System.out.println("Các key: ");
		getKey();

		System.out.println("Các value: ");
		getValue();
		
	}

	

	public static Student[] question6() {
		mapStudents.put(1, "Lan");
		mapStudents.put(2, "Huệ");
		mapStudents.put(3, "Cúc");

		System.out.println("Q7, d: Chuyển map sang set");
		Set<Map.Entry<Integer, String>> setMapStudents = mapStudents.entrySet();
		for (Map.Entry<Integer, String> i : setMapStudents) {
			System.out.println(i.getKey() + "   -->   " + i.getValue());
		}
		return null;

	}

	public static void question5() {

	}

	public static void question4() {

	}

	public static void question3() {
		Student2[] students = createStudent1();
		System.out.println("Tổng số phần tử của students: " + setStudents.size());

		System.out.println("");
		System.out.println("Các student: ");
		System.out.println(setStudents.toString());
		System.out.println("Tìm kiếm Student theo ID & theo tên");
		searchStudent2();
	}

	public static void question2() {
		System.out.println("Thứ tự tới của các học sinh từ sớm nhất tới muộn nhất");
		queueStudent();

		System.out.println("");
		System.out.println("Thứ tự tới của các học sinh từ muộn nhất tới sớm nhất");
		stackStudent();
	}

	public static void question1() {
		Student[] students = createStudent();
		System.out.println("Tổng số phần tử của students: " + listStudent.size());

		System.out.println("");
		System.out.println("Nhập vị trí phần tử muốn lấy ra: ");
		int x = scanner.nextInt();
		System.out.println("Kết quả: " + layRaPhanTuThuI(x));

		System.out.println("");
		System.out.println("Phần tử đầu = " + layRaPhanTuDau());
		System.out.println("Phần tử cuối = " + layRaPhanTuCuoi());

		System.out.println("");
		System.out.println("Phần tử mới được thêm vào đầu: ");
		listStudent.add(0, new Student(4, "Kiên"));
		System.out.println(layRaPhanTuDau());

		System.out.println("");
		System.out.println("Phần tử mới được thêm vào cuối: ");
		listStudent.add(listStudent.size(), new Student(5, "Nam"));
		System.out.println(layRaPhanTuCuoi());

		System.out.println("");
		System.out.println("Các phần tử có trong mảng: ");
		System.out.println(listStudent.toString());
		System.out.println("Đảo ngược mảng! Kết quả: ");
		daonguocMang();
		System.out.println(listStudent.toString());

		System.out.println("");
		System.out.println("Các student: ");
		System.out.println(listStudent.toString());
		System.out.println("Tìm kiếm Student theo ID & theo tên");
		searchStudent();

		System.out.println("");
		System.out.println("Student trùng tên: ");
		trungTen();

		System.out.println("");
		System.out.println("Các student: ");
		System.out.println(listStudent.toString());
		System.out.println("Nhập ID có tên student muốn xóa: ");
		xoaStudent(scanner.nextInt());
		System.out.println(listStudent.toString());

		System.out.println("");
		System.out.println("Các student: ");
		System.out.println(listStudent.toString());
		System.out.println("Nhập ID của student muốn xóa: ");
		deleteStudnet(scanner.nextInt());
		System.out.println(listStudent.toString());

		System.out.println("");
		System.out.println("Các student trong 'listStudent' : ");
		System.out.println(listStudent.toString());
		System.out.println("Các student trong 'studentCopies' : ");
		copyStudent();
		System.out.println(studentCopies.toString());
	}

	public static Student[] createStudent() {
		Student student1 = new Student(1, "Hà");
		Student student2 = new Student(2, "Thu");
		Student student3 = new Student(3, "Miên");
		Student student4 = new Student(4, "Thu");
		Student student5 = new Student(5, "Thu");
		Student student6 = new Student(6, "Miên");

		listStudent.add(student1);
		listStudent.add(student2);
		listStudent.add(student3);
		listStudent.add(student4);
		listStudent.add(student5);
		listStudent.add(student6);

		return null;
	}

	public static Student[] createStudent2() {
		Student student1 = new Student(1, "Nguyễn Văn Nam");
		Student student2 = new Student(2, "Nguyễn Văn Huyên");
		Student student3 = new Student(3, "Trần Văn Nam");
		Student student4 = new Student(4, "Nguyễn Văn A");

		stackStudents.push(student1);
		stackStudents.push(student2);
		stackStudents.push(student3);
		stackStudents.push(student4);

		queueStudents.add(student1);
		queueStudents.add(student2);
		queueStudents.add(student3);
		queueStudents.add(student4);

		return null;
	}

	public static Student2[] createStudent1() {
		Student2 student1 = new Student2(1, "Hà");
		Student2 student2 = new Student2(2, "Thu");
		Student2 student3 = new Student2(3, "Miên");
		Student2 student4 = new Student2(4, "Thu");
		setStudents.add(student1);
		setStudents.add(student2);
		setStudents.add(student3);
		setStudents.add(student4);

		Iterator<Student2> studentsIterator = setStudents.iterator();
		return null;
	}

	public static Student layRaPhanTuThuI(int i) {
		return listStudent.get(i);

	}

	public static Student layRaPhanTuDau() {
		return listStudent.get(0);

	}

	public static Student layRaPhanTuCuoi() {
		return listStudent.get(listStudent.size() - 1);

	}

	public static void daonguocMang() {
		Collections.reverse(listStudent);

	}

	public static void searchStudent() {
		System.out.println("Nhập ID: ");
		int x = scanner.nextInt();
		scanner.nextLine();
		for (Student hocSinh : listStudent) {
			if (hocSinh.getId() == x) {
				System.out.println("Kết quả: " + hocSinh.toString());
			}
		}

		System.out.println("Nhập tên: ");
		String s1 = scanner.nextLine();
		for (Student student : listStudent) {
			if (student.getName().equals(s1)) {
				System.out.println("Kết quả: " + student.toString());
			}
		}
	}

	public static void searchStudent2() {
		System.out.println("Nhập ID: ");
		int x = scanner.nextInt();
		scanner.nextLine();
		for (Student2 hocSinh : setStudents) {
			if (hocSinh.getId() == x) {
				System.out.println("Kết quả: " + hocSinh.toString());
			}
		}

		System.out.println("Nhập tên: ");
		String s1 = scanner.nextLine();
		for (Student2 student : setStudents) {
			if (student.getName().equals(s1)) {
				System.out.println("Kết quả: " + student.toString());
			}
		}
	}

	public static void trungTen() {
		for (int i = 0; i < listStudent.size(); i++) {
			System.out.println(listStudent.get(i));
			for (int j = 0; j < listStudent.size(); j++) {
				System.out.println(listStudent.get(j));
				if (listStudent.get(i).getId() == listStudent.get(j).getId())
					continue;
				if (listStudent.get(i).getName().equals(listStudent.get(j).getName())) {
					listStudent2.add(listStudent.get(i));
					break;
				}
			}
		}
		System.out.println(listStudent2);
	}

//	public void danhSachStudentTrungten() {
//		List<Student> listStudent2 = new ArrayList<Student>();
//		// listStudent2 = [];
//		// *
//		// listStudent = ["nam","hung","nam","nam","hung","tuan2"]
//		// listStudent2 = ["nam"]
//		// *
//		// listStudent = ["nam","hung","nam","nam","hung","tuan2"]
//		// listStudent2 = ["nam","hung"]
//		// listStudent = ["nam","hung","nam","nam","hung","tuan2"]
//		// listStudent2 = ["nam","hung","nam"]
//		// listStudent = ["nam","hung","nam","nam","hung","tuan2"]
//		// listStudent2 = ["nam","hung","nam","nam"]
//		// listStudent2 = ["nam","hung","nam","nam","hung"]
//		for (int i = 0; i < listStudent.size(); i++) {
//			System.out.println(listStudent.get(i));
//			for (int j = 0; j < listStudent.size(); j++) {
//				System.out.println(listStudent.get(j));
//				// nếu listStudent.get(j) có trùng id với
//				// listStudent.get(i) thì bỏ qua so sánh bạn khác
//				if (listStudent.get(i).getId() == listStudent.get(j).getId())
//					continue;
//				if (listStudent.get(i).getName().equals(listStudent.get(j).getName())) {
//					listStudent2.add(listStudent.get(i));
//					break;
//				}
//			}
//		}
//		System.out.println(listStudent2);
//	}

	public static void xoaStudent(int id) {
		for (int i = 0; i < listStudent.size(); i++) {
			if (listStudent.get(i).getId() == id) {
				listStudent.get(i).setName(null);
			}
		}

	}

	public static void deleteStudnet(int id) {
		for (int i = 0; i < listStudent.size();) {
			if (listStudent.get(i).getId() == id) {
				listStudent.remove(i);
			} else {
				i++;
			}
		}

	}

	public static void copyStudent() {
		for (Student cacStudent : listStudent) {
			studentCopies.add(cacStudent);
		}
	}

	public static void stackStudent() {
		Student[] students2 = createStudent2();
		int sizeOfStudents = stackStudents.size();
		for (int i = 0; i < sizeOfStudents; i++) {
			System.out.println(stackStudents.pop());
		}

	}

	public static void queueStudent() {
		Student[] students2 = createStudent2();
		int sizeOfStudents = queueStudents.size();
		for (int i = 0; i < sizeOfStudents; i++) {
			System.out.println(queueStudents.poll());
		}

	}

	public static void getKey() {
		Iterator<Map.Entry<Integer, String>> studentsIterator = mapStudents.entrySet().iterator();
		while (studentsIterator.hasNext()) {

			System.out.println(studentsIterator.next().getKey());
		}

	}
	
	public static void getValue() {
		Iterator<Map.Entry<Integer, String>> studentsIterator = mapStudents.entrySet().iterator();
		while (studentsIterator.hasNext()) {
			System.out.println(studentsIterator.next().getValue());
		}
	}
	
	public static void sapxepStdent() {
		
	}

}
