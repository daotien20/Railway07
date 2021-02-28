package frontend;

import java.io.ObjectInputStream.GetField;

import org.omg.CORBA.PUBLIC_MEMBER;

import entity.Ex2Q1_Student;

public class TestEx2Q1_Student {
	public static void main(String[] args) {
		Ex2Q1_Student[] students = new Ex2Q1_Student[10];

		Ex2Q1_Student student1 = new Ex2Q1_Student(1, "Nam", 3);
		Ex2Q1_Student student2 = new Ex2Q1_Student(2, "Kiên", 2);
		Ex2Q1_Student student3 = new Ex2Q1_Student(3, "Hà", 1);
		Ex2Q1_Student student4 = new Ex2Q1_Student(4, "Tuấn", 2);
		Ex2Q1_Student student5 = new Ex2Q1_Student(5, "Hương", 3);
		Ex2Q1_Student student6 = new Ex2Q1_Student(6, "Chiến", 1);
		Ex2Q1_Student student7 = new Ex2Q1_Student(7, "Hương", 2);
		Ex2Q1_Student student8 = new Ex2Q1_Student(8, "Thi", 3);
		Ex2Q1_Student student9 = new Ex2Q1_Student(9, "Phương", 2);
		Ex2Q1_Student student10 = new Ex2Q1_Student(10, "Miên", 3);

		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
		students[4] = student5;
		students[5] = student6;
		students[6] = student7;
		students[7] = student8;
		students[8] = student9;
		students[9] = student10;

		System.out.println("Cả lớp điểm danh!");
		for (Ex2Q1_Student hocSinh : students) {
			hocSinh.diemDanh();
		}
		
		System.out.println("");
		System.out.println("Nhóm 1 đi học bài!");
		for (Ex2Q1_Student hocSinh : students) {
			if(hocSinh.getGroup() == 1) {
				hocSinh.hocBai();
			}
		}
		
		System.out.println("");
		System.out.println("Nhóm 2 đi dọn vệ sinh!");
		for (Ex2Q1_Student hocSinh : students) {
			if(hocSinh.getGroup() == 2) {
				hocSinh.diDonVeSinh();
			}
		}
	}

}
