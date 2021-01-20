package Program;

import java.time.LocalDate;

import entity.Account;

public class RunDefaultValue {
//Question: Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi 
//tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):

	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		for (int i = 0; i < accounts.length; i++ ) {
			accounts[i] = new Account();
			accounts[i].accountID = (i + 1);
			accounts[i].email = "Email " + (i + 1);
			accounts[i].userName = "User Name " + (i + 1);
			accounts[i].fullName = "Full Name " + (i + 1);
			accounts[i].createDate = LocalDate.now();
		}
		
		System.out.println("Done! Danh sách tài khoản vừa tạo");
		for (Account account: accounts) {
			System.out.println("id: " + account.accountID);
			System.out.println("email: " + account.email);
			System.out.println("userName: " + account.userName);
			System.out.println("fullName: " + account.fullName);
			System.out.println("createDate: " + account.createDate);
			System.out.println("");
			
		}
		
	}

}
