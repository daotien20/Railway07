package Program;

import java.text.SimpleDateFormat;
import java.util.Date;

import Table.Account;
import Table.Department;

public class RunSystemOutPrintf {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
	}

	private static void question6() {
		Account[] accounts = AddData.addAccount();
		
		System.out.println("Question 6----------------------");
		System.out.println("====================================================================================");
		System.out.printf(	"%-30s %-25s %-25s %s %n", 
							"|EMAIL", "|FULLNAME", "|PHÒNG BAN", "|" );
		System.out.println("------------------------------------------------------------------------------------");
		
		for (Account account : accounts) {
			System.out.printf(	"%-30s %-25s %-25s %s %n",
								"|" + account.email, "|" + account.fullName, "|" + account.department.departmentName, "|");
			System.out.println("------------------------------------------------------------------------------------");
		}		
		
	}

	private static void question5() {
		System.out.println("Question 5: Lấy thời gian bây giờ và in ra theo định dạng");
		String pattern = "dd-MM-yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		System.out.println("");		
	}

	private static void question4() {
		System.out.println("Question 4----------------------");
		String fullName = "Nguyễn Văn A";
		System.out.printf("%s %s %n","Tên tôi là " + fullName,"và tôi đang độc thân.");
		System.out.println("");		
	}

	private static void question3() {
		System.out.println("Question 3----------------------");
		float b = 5.567098f;
		System.out.printf("%.4f %n %n", 5.567098f);		
	}

	private static void question2() {
		System.out.println("Question 2----------------------");
		int a = 100000000;
		System.out.printf("%,d %n %n", 100000000);		
	}

	private static void question1() {
		System.out.println("Question 1----------------------");
		int i = 5;
		System.out.printf("%d %n %n", 5);		
	}

}
