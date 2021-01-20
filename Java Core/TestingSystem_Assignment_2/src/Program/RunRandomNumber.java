package Program;

import java.time.LocalDate;
import java.util.Random;

public class RunRandomNumber {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		

	}

	private static void question7() {
		Random random = new Random();
		int x = random.nextInt(999 - 100 + 1) + 100;
		
		System.out.println("Question7: Lấy ngẫu nhiên 1 số có 3 chữ số");
		System.out.println(x);
	}

	private static void question6() {
		Random random = new Random();
		int minDate = (int) LocalDate.of(2019, 11, 27).toEpochDay();
		int maxDate = (int) LocalDate.of(2020, 11, 27).toEpochDay();
		
		long randomLong = minDate + random.nextInt(maxDate - minDate);
		
		int today = (int) LocalDate.now().toEpochDay();
		randomLong = today - (int) random.nextInt(365);
		LocalDate randomDate = LocalDate.ofEpochDay(randomLong);
		
		System.out.println("Question6: Lấy ngẫu nhiên 1 ngày trong quá khứ");
		System.out.println(randomDate);
		System.out.println("");
	}

	private static void question5() {
		Random random = new Random();
		int minDate = (int) LocalDate.of(2019, 11, 27).toEpochDay();
		int maxDate = (int) LocalDate.of(2020, 11, 27).toEpochDay();

		long randomLong = minDate + random.nextInt(maxDate - minDate);
		
		int today = (int) LocalDate.now().toEpochDay();

		randomLong = today - (int) (Math.random() * (364 - 1 + 1) + 1);

		LocalDate randomDate = LocalDate.ofEpochDay(randomLong);
		
		System.out.println("Question4: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây");
		System.out.println(randomDate);
		System.out.println("");

	}

	private static void question4() {
		Random random = new Random();
		int minDate = (int) LocalDate.of(1995, 7, 24).toEpochDay();
		int maxDate = (int) LocalDate.of(1995, 12, 20).toEpochDay();

		long randomLong = minDate + random.nextInt(maxDate - minDate);

		LocalDate randomDate = LocalDate.ofEpochDay(randomLong);
		System.out.println("Question4: In ngẫu nhiên 1 ngày trong khoảng thời gian 24/07/1995 tới này 20/12/1995");
		System.out.println(randomDate);
		System.out.println("");
	}

	private static void question3() {
		System.out.printf("%s %s %n", "Question3: Khai báo 1 array bao gồm các tên của các bạn trong lớp,",
							"sau đó in ngẫu nhiên ra tên của 1 bạn");
		
		String[] students = {"Mai Văn Hiến", "Cù Lao Chàm", "A Bờ Cờ"};
		
		Random	random = new Random();
		int x = random.nextInt(students.length);
		System.out.println(students[x]);
		System.out.println("");
		
	}

	private static void question2() {
		Random	random = new Random();
		float x = random.nextFloat();
		System.out.println("Question2: In ngẫu nhiên ra 1 số thực");
		System.out.println(x);
		System.out.println("");
	}

	private static void question1() {
		Random	random = new Random();
		int x = random.nextInt();
		System.out.println("Question1: In ngẫu nhiên ra 1 số nguyên");
		System.out.println(x);
		System.out.println("");
	}
}

