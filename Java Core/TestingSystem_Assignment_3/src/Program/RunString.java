package Program;

import java.time.LocalDate;
import java.util.Scanner;

import entity.Group;

public class RunString {

	public static void main(String[] args) {
//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
//		question7();
//		question8_9();
//		question10();
//		question11();
//		question12();
//		question13();
//		question14();
//		question15();
//		question16();
		

	}

	private static void question16() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Nhập 1 xâu ký tự bất kỳ: ");
			String s1 = scanner.nextLine();
			s1 = s1.trim();	
			System.out.println(s1);
			
			while(true) {
				System.out.println("Nhập 1 số nguyên bất kỳ: ");
				int x = scanner.nextInt();
				scanner.nextLine();
				if(x >= 0) {
					if (s1.length() % x == 0) {
						System.out.println("chia được");
						break;
					}else {
						System.out.println("KO");
						break;
					}
				}else {
					System.out.println("Mời nhập lại!");
					continue;
				}
			}
			continue;
		}
	}

	private static void question15() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Nhập 1 xâu ký tự bất kỳ: ");
			String s1 = scanner.nextLine();
			s1 = s1.trim();	
			s1 = s1.replaceAll("\\s+", " ");
			
			String[] words = s1.split("\\s");
			
			for (int i = words.length - 1; i >= 0;) {
				System.out.print(words[i] + " ");
				i--;
			}
			System.out.println("");
		}
	}

	private static void question14() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Nhập 1 xâu ký tự bất kỳ: ");
			String s1 = scanner.nextLine();
			s1 = s1.trim();	
			System.out.println(s1);

			scanner.nextLine();
			System.out.println("Nhập 1 ký tự muốn thay thế: ");
			String s2 = scanner.next();
			String s3 = s1.replace(s2, "*");
			
			for (int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i) == s2.charAt(0)) {
					System.out.println("Kết quả: " + s3);
					break;
				}
			}
			System.out.println("");
		}
		
	}

	private static void question13() {
		String s1 = "abc123";
		
		boolean tamp = false; //biến tạm, nếu s1 không true thì mặc định là false
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) >= 0 && s1.charAt(i) <=9) {
				tamp = true;
				break;
			}
		}
		
		if (tamp = true) {
			System.out.println("Chuỗi " + s1 + " có chứa chữ số");
		}else {
			System.out.println("Chuỗi " + s1 + " ko chứa chữ số");
		}
	}

	private static void question12() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Nhập 1 xâu ký tự bất kỳ: ");
			String s1 = scanner.nextLine();
			String s2 = new StringBuilder(s1).reverse().toString();
			System.out.println("Kết quả: " + s2);
		}
	}

	private static void question11() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Nhập 1 xâu ký tự bất kỳ: ");
			String s1 = scanner.nextLine();
			s1 = s1.trim();
			s1 = s1.replaceAll("\\s+", "");
			System.out.println(s1);

			scanner.nextLine();
			System.out.println("Nhập 1 ký tự muốn đếm: ");
			char s2 = scanner.next().charAt(0);
			int answer = 0;
			for (int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i) == s2) {
					answer ++;
				}
			}
			System.out.print("Ký tự " + s2 + " có " + answer + " ký tự.");
			System.out.println("");
		}
	}


	private static void question10() {
		String s1 = "KO";
		String s2 = "OK";
		String s3 = new StringBuilder(s1).reverse().toString();
		if (s2.equals(s3)) {
			System.out.println("OK");		
		}else {
			System.out.println("KO");	
		}
		
		
	}

	private static void question8_9() {
		Group[] groups = AddData.addGroup();
		
		System.out.println("Question 8 ----------------");
		for(int i =0; i < groups.length; i++) {
			if (groups[i].groupName.contains("Java"))  {
				System.out.println(groups[i].toString());
				}
			}
		
		System.out.println("");	
		System.out.println("Question 9 ----------------");
		for(int a =0; a < groups.length; a++) {
			if (groups[a].groupName == "Java")  {
				System.out.println(groups[a].toString());
			}
		}
	}

	private static void question7() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Họ và tên của bạn: ");
		String fullName = scanner.nextLine();

		fullName = fullName.trim();
		fullName = fullName.replaceAll("\\s+", " ");
		System.out.println(fullName);

		String[] words = fullName.split("\\s");

		for (int i = 0; i < words.length; i++) {
			String string1 = words[i];
			words[i] = string1.substring(0, 1).toUpperCase() + string1.substring(1);
		}

		String s1 = "";
		for (String string1 : words) {
			s1 = s1 + string1 + " ";
		}
		System.out.println(s1);

	}

	private static void question6() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Họ và tên của bạn: ");
		String fullName = scanner.nextLine();

		fullName = fullName.trim();
		fullName = fullName.replaceAll("\\s+", " ");

		String[] words = fullName.split("\\s");

		int firstSpace = fullName.indexOf(" ");
		int lastSpace = fullName.lastIndexOf(" ");
		String middleWords = fullName.substring(firstSpace, lastSpace);

		String lastWord = words[words.length - 1];

		System.out.println("Họ của bạn: " + words[0]);
		System.out.println("Tên đệm của bạn: " + middleWords);
		System.out.println("Tên của bạn: " + lastWord);

	}

	private static void question5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Họ của bạn: ");
		String lastName = scanner.nextLine();
		System.out.println("Tên của bạn: ");
		String firstName = scanner.nextLine();

		String s1 = lastName + " " + firstName;
		System.out.println("Họ và tên của bạn: " + s1);
	}

	private static void question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào tên của bạn: ");
		String chuoi1 = scanner.nextLine();

		chuoi1 = chuoi1.trim();
		String[] words = chuoi1.split("");
		for (String s1 : words) {
			System.out.println(s1.toUpperCase());
		}
	}

	private static void question3() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời bạn nhập một xâu ký tự: ");
		String chuoi2 = scanner.nextLine();
		chuoi2 = chuoi2.trim(); 
		chuoi2 = chuoi2.replaceAll("\\s+", " ");

		String[] words = chuoi2.split("\\s");

		for (int i = 0; i < words.length; i++) {
			String string1 = words[i];
			words[i] = string1.substring(0, 1).toUpperCase() + string1.substring(1);
			System.out.println(words[i]);

		}
		String s4 = "";
		for (String string1 : words) {
			s4 = s4 + string1 + " ";
		}
		System.out.println(s4);
	}

	private static void question2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập xâu ký tự 1: ");
		String s1 = scanner.nextLine();

		System.out.println("Nhập xâu ký tự 2: ");
		String s2 = scanner.nextLine();

		String s3 = s1 + " " + s2;
		System.out.println(s3);
	}

	private static void question1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập một xâu ký tự: ");
		String chuoi1 = scanner.nextLine();
		chuoi1 = chuoi1.trim(); 
		chuoi1 = chuoi1.replaceAll("\\s+", " ");
		String[] words = chuoi1.split("\\s");
		System.out.println("Số lượng các từ trong xâu ký tự: " + words.length);

	}

}
