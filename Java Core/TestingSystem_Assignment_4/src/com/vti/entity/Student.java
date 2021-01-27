package com.vti.entity;

public class Student {
	//a
		private int 	studentId;
		private String 	name;
		private String 	hometown;
		private float 	score;

		//b
		public Student(String name, String hometown) {
			this.name = name;
			this.hometown = hometown;
			this.score = 0;
		}
		
		public int getStudentId() {
			return studentId;
		}
		public String getName() {
			return name;
		}
		public String getHometown() {
			return hometown;
		}
		public float getScore() {
			return score;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setHometown(String hometown) {
			this.hometown = hometown;
		}
		
		//c. Method cho phép set điểm vào
		public void setScore(float score) {
			this.score = score;
		}
		
		//d. Method cho phép cộng thêm điểm
		public void plusScore (float score) {
			this.score = this.score + score;
		}
		
		//e. Method để In ra thông tin sinh viên, điểm học lực và xếp loại theo điểm học lực
		@Override
		public String toString() {
			String rank;
			if (score < 4.0) {
				rank = "Yếu";
			} else if (score < 6) {
				rank = "Trung bình";
			} else if (score < 8) {
				rank = "Khá";
			} else {
				rank = "Giỏi";
			}
			return "Ex4Encapsulation [studentId=" + studentId + ", name=" + name + ", hometown=" + hometown + ", score="
					+ score + ", rank=" + rank + "]";
		}
}
