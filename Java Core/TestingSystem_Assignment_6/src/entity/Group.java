package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import backend.ScannerUtils;

public class Group {
	private int			groupID;
	private String 		groupName;
	private Account[]	accounts;
	
	public void Group() throws Exception {
		List<Account> accounts = new ArrayList<Account>();
		groupID = inputGroupID();
		groupName = inputGroupName();
		while(true) {
			System.out.println("Nhập số lượng account muốn thêm: ");
			int y = ScannerUtils.inputInt("Cần nhập 1 số nguyên >= 0");
			
			if(accounts.size() >= y) {
				throw new Exception("Group đã đủ thành viên");
			}else {
				Account account1 = new Account();
				
				accounts.add(account1);
				
				System.out.println("Bạn có muốn thêm account không?");
				System.out.println("1: Có; 2: Không");
				int x = ScannerUtils.inputInt("Nhập sai! Nhập lại!");
				if(x == 1) {
					continue;
				}else if(x==2) {
					System.out.println("Đã thêm account xong");
					break;
				}
			}
		}
		
	}
	private int inputGroupID() {
		System.out.println("Input GroupID: ");
		int idGroup = ScannerUtils.inputInt("Nhập sai, Nhập lại!");
		return idGroup;
		
	}
	
	private String inputGroupName() {
		System.out.println("Input GroupName: ");
		String nameGroup = ScannerUtils.inputString("Nhập sai, Nhập lại!");
		return nameGroup;
	}
	
}

