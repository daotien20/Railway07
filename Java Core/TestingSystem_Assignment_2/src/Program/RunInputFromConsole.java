package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import Table.Account;
import Table.Department;
import Table.Group;
import Table.PositionName;

public class RunInputFromConsole {

	public static void main(String[] args) throws ParseException {
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		question8();
		question9();
		question10();
		question11();
		
	}

	private static void question11() {
	//yêu cầu: tạo 1 method riêng để nhập các thông tin cho đỡ dài
		
		Account[] accounts = AddData.addAccount();
		Group[] groups = AddData.addGroup();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
			System.out.println(
					"1: Tạo account; 2: Tạo department; 3: Thêm account vào group; 4: Thêm account vào 1 group ngẫu nhiên");
			int a = scanner.nextInt();
			scanner.nextLine();
			if (a == 1) {
				System.out.println("Mời tạo account: ");

				System.out.println("Nhập Id:");
				int accountID = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Nhập email: ");
				String email = scanner.nextLine();

				System.out.println("Nhập username: ");
				String userName = scanner.nextLine();

				System.out.println("Nhập fullname: ");
				String fullName = scanner.nextLine();
				System.out.println("");

				System.out.println("Done! Tài khoản của bạn: ");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					return;
				}

			} else if (a == 2) {
				System.out.println("Mời tạo department: ");

				System.out.println("Nhập Id: ");
				int departmentID = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Nhập tên phòng ban: ");
				String departmentName = scanner.nextLine();
				System.out.println("");

				System.out.println("Done! Phòng ban của bạn: ");
				System.out.println("ID: " + departmentID);
				System.out.println("Tên phòng ban: " + departmentName);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					return;
				}

			}else if (a == 3) {
				System.out.println("Mời thêm group vào account: ");

				System.out.println("Các usernames: ");
				for (int b = 0; b < accounts.length; b++) {
					System.out.println("STT" + (b + 1) + " " + accounts[b].userName);
				}

				System.out.println("");

				System.out.println("Nhập vào username của bạn: ");
				String s1 = scanner.nextLine();
				scanner.nextLine();

				System.out.println("Các group: ");
				for (int c = 0; c < groups.length; c++) {
					System.out.println("STT" + (c + 1) + " " + groups[c].groupName);
				}

				System.out.println("");

				System.out.println("Nhập vào group bạn muốn tham gia: ");
				String s2 = scanner.nextLine();
				System.out.println("");
				
				System.out.println("Done!");
				System.out.println("Username: " + s1);
				System.out.println("Group: " + s2);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					return;
				}

			} else if (a == 4) {
				System.out.println("Các usernames: ");
				for (int b = 0; b < accounts.length; b++) {
					System.out.println("STT" + (b + 1) + ": " + accounts[b].userName);
				}

				System.out.println("");

				System.out.println("Nhập vào username của bạn: ");
				String s1 = scanner.nextLine();
				scanner.nextLine();

				System.out.println("Các group: ");
				for (int c = 0; c < groups.length; c++) {
					System.out.println("STT" + (c + 1) + ": " + groups[c].groupName);
				}

				System.out.println("");

				Random random = new Random();
				int n = random.nextInt(groups.length);
				String s2 = "Group của bạn: ";
				System.out.println(s2 + groups[n].groupName);
				
				System.out.println("Done!");
				System.out.println("Username: " + s1);
				System.out.println("Group: " + groups[n].groupName);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					return;
				}

			} else {
				System.out.println("Mời bạn nhập lại!");
				continue;
			}
		}		
	}

	private static void question10() {
	//thiếu: nếu nhập y !=1 hoặc y!=2 → yêu cầu nhập lại số để 1: tiếp tục chương trình, 2: thoát chương trình
		Account[] accounts = AddData.addAccount();
		Group[] groups = AddData.addGroup();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
			System.out.println("1: Tạo account; 2: Tạo department; 3: Thêm group vào account");
			int a = scanner.nextInt();
			scanner.nextLine();

			if (a == 1) {
				System.out.println("Mời tạo account: ");

				System.out.println("Nhập Id:");
				int accountID = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Nhập email: ");
				String email = scanner.nextLine();

				System.out.println("Nhập username: ");
				String userName = scanner.nextLine();

				System.out.println("Nhập fullname: ");
				String fullName = scanner.nextLine();
				System.out.println("");

				System.out.println("Done! Tài khoản của bạn: ");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
					int y = scanner.nextInt();
					if (y == 1) {
						continue;
					} else {
						return;
					}

			} else if (a == 2) {
				System.out.println("Mời tạo department: ");

				System.out.println("Nhập Id: ");
				int departmentID = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Nhập tên phòng ban: ");
				String departmentName = scanner.nextLine();
				System.out.println("");

				System.out.println("Done! Phòng ban của bạn: ");
				System.out.println("ID: " + departmentID);
				System.out.println("Tên phòng ban: " + departmentName);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
					int y = scanner.nextInt();
					if (y == 1) {
						continue;
					} else {
						return;
					}

			} else if (a == 3) {
				System.out.println("Mời thêm group vào account: ");

				System.out.println("Các usernames: ");
				for (int b = 0; b < accounts.length; b++) {
					System.out.println("STT" + (b + 1) + " " + accounts[b].userName);
				}

				System.out.println("Nhập vào username của bạn: ");
				String s1 = scanner.nextLine();

				System.out.println("Các group: ");
				for (int c = 0; c < groups.length; c++) {
					System.out.println("STT" + (c + 1) + " " + groups[c].groupName);
				}

				System.out.println("");

				System.out.println("Nhập vào group bạn muốn tham gia: ");
				String s2 = scanner.nextLine();
				System.out.println("");
				
				System.out.println("Done!");
				System.out.println("Username: " + s1);
				System.out.println("Group: " + s2);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
					int y = scanner.nextInt();
					if (y == 1) {
						continue;
					} else {
						return;
					}

			} else {
				System.out.println("Mời bạn nhập lại!");
				continue;
			}
		}		
	}

	private static void question9() {
	//thiếu: điều kiện s1 == userName (nếu user nhập tên == 1 userName trong các usernames → thêm vào group 
		
		Account[] accounts = AddData.addAccount();
		Group[] groups = AddData.addGroup();

		System.out.println("Các usernames: ");
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("STT" + (i + 1) + ": " + accounts[i].userName);
		}

		System.out.println("");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào username của bạn: ");
		String s1 = scanner.nextLine();
		System.out.println("");

		System.out.println("Các group: ");
		for (int a = 0; a < groups.length; a++) {
			System.out.println("STT" + (a + 1) + ": " + groups[a].groupName);
		}

		System.out.println("");

		System.out.println("Nhập vào group bạn muốn tham gia: ");
		String s2 = scanner.nextLine();
		System.out.println("");

		System.out.println("Username: " + s1);
		System.out.println("Group: " + s2);		
	}

	private static void question8() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
			System.out.println("1: Tạo account; 2: Tạo department");
			int a = scanner.nextInt();
			if (a == 1) {
				System.out.println("Mời tạo account: ");

				System.out.println("Nhập Id:");
				int accountID = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Nhập email: ");
				String email = scanner.nextLine();

				System.out.println("Nhập username: ");
				String userName = scanner.nextLine();

				System.out.println("Nhập fullname: ");
				String fullName = scanner.nextLine();
				System.out.println("");

				System.out.println("Tài khoản của bạn: ");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				break;
			} else if (a == 2) {
				System.out.println("Mời tạo department: ");

				System.out.println("Nhập Id: ");
				int departmentID = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Nhập tên phòng ban: ");
				String departmentName = scanner.nextLine();
				System.out.println("");

				System.out.println("Phòng ban của bạn: ");
				System.out.println("ID: " + departmentID);
				System.out.println("Tên phòng ban: " + departmentName);
				break;
			} else {
				System.out.println("Mời bạn nhập lại!");
				continue;
			}
		}
	}

	private static void question7() {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Nhập vào số chẵn: ");
			int x = scanner.nextInt();
			if (x % 2 != 0) {
				System.out.println("Đây không phải số chẵn");
			} else {
				System.out.println(x + " " + "đúng là số chẵn");
				break;
			}
		}		
	}

	private static void question6() {
		Scanner scanner = new Scanner(System.in);
		Department department1 = new Department();
		
		System.out.println("Nhập Id: ");
		int id1 = scanner.nextInt();
		department1.departmentID = id1;
		scanner.nextLine();
		
		System.out.println("Nhập tên: ");
		department1.departmentName = scanner.nextLine();

		System.out.println(department1.toString());
	}

	private static void question5() {
		Account[] accounts = AddData.addAccount();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời tạo account ===============");

		System.out.println("Nhập Id:");
		int accountID = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhập email: ");
		String email = scanner.nextLine();

		System.out.println("Nhập username: ");
		String userName = scanner.nextLine();

		System.out.println("Nhập fullname: ");
		String fullName = scanner.nextLine();
		System.out.println("");
		
		while(true) {
			System.out.println("Nhập position (lựa chọn một số từ 1 đến 4): ");
			System.out.println("1: Dev; 2: Test; 3: Scrum Master; 4: PM");
			int y = scanner.nextInt();
			switch (y) {
			case 1:
				System.out.println("");
				System.out.println("Done! Tài khoản của bạn ===============");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				System.out.println("Phòng ban: " + PositionName.DEV);
				System.out.println("Ngày khởi tạo: " + LocalDate.now());
				break;
			case 2:
				System.out.println("");
				System.out.println("Done! Tài khoản của bạn ===============");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				System.out.println("Phòng ban: " + PositionName.TEST);
				System.out.println("Ngày khởi tạo: " + LocalDate.now());
				break;
			case 3:
				System.out.println("");
				System.out.println("Done! Tài khoản của bạn ===============");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				System.out.println("Phòng ban: " + PositionName.SCUM_MASTER);
				System.out.println("Ngày khởi tạo: " + LocalDate.now());
				break;
			case 4:
				System.out.println("");
				System.out.println("Done! Tài khoản của bạn ===============");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				System.out.println("Phòng ban: " + PositionName.PM);
				System.out.println("Ngày khởi tạo: " + LocalDate.now());
				break;
			default:
				System.out.println("Mời bạn nhập lại!");
				continue;
			}
			break;
		}		
	}

	private static void question4() throws ParseException {
		System.out.println("Question 4-----------------------------");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào ngày sinh nhật của bạn (theo định dạng ngày-tháng-năm): ");
		String dateInput = scanner.nextLine();
		
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date date = dateFormat.parse(dateInput);
		String birthDate = dateFormat.format(date);
		System.out.println("Sinh nhật của bạn: " + birthDate);		
	}

	private static void question3() {
		System.out.println("Question 3-----------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ và tên");
		System.out.println("Họ của bạn: ");
		String lastName = scanner.nextLine();
		System.out.println("Tên của bạn: ");
		String firstName = scanner.nextLine();
		String s1 = lastName + " " + firstName;
		System.out.println("Họ và tên của bạn: " + s1);	
		System.out.println("");
	}

	private static void question2() {
		System.out.println("Question 2-----------------------------");
		Scanner scanner = new Scanner(System.in);
		int i;
		for (i = 1; i < 3; i++) {
			System.out.println("Nhập vào số thực thứ " + i + ":");
			double x = scanner.nextDouble();
			System.out.println(x);
			System.out.println("");
		}		
	}

	private static void question1() {
		System.out.println("Question 1-----------------------------");
		Scanner scanner = new Scanner(System.in);
		int i;
		for (i = 1; i < 4; i++) {
			System.out.println("Nhập vào số nguyên thứ " + i + ":");
			int x = scanner.nextInt();
			System.out.println(x);
			System.out.println("");
		}		
	}

}
