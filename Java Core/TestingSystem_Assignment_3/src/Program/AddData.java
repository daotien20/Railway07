package Program;

import entity.Position;
import entity.PositionName;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import entity.Account;
import entity.Department;
import entity.Group;

public class AddData {
	public static Department[] addDepartment() {
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Test";
		
		Department departments[] = {department1,department2,department3};
		
		return departments;
	}
	
	public static Position[] addPosition() {
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = PositionName.DEV;

		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = PositionName.PM;

		Position position3 = new Position();
		position3.positionID = 3;
		position3.positionName = PositionName.SCUM_MASTER;
		
		Position positions[]= {position1,position2,position3};
		
		return positions;
	}
	
	public static Account[] addAccount() {
		Department[] departments = addDepartment();
		Position[] positions = addPosition();
		
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "cuongnm@gmail.com";
		account1.userName = "cuongnm";
		account1.fullName = "nguyen cuong";
		account1.department = departments[1];
		account1.position = positions[2];
		account1.createDate = LocalDate.of(2019, 12, 23);

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "hoangvanthu@gmail.com";
		account2.userName = "hoangvanthu";
		account2.fullName = "hoang van thu";
		account2.department = departments[0];
		account2.position = positions[1];
		account2.createDate = LocalDate.of(2019, 12, 23);

		Account account3 = new Account();
		account3.accountID = 2;
		account3.email = "nguyenchienthang@gmail.com";
		account3.userName = "nguyenc";
		account3.fullName = "nguyen chien thang";
		account3.department = departments[2];
		account3.position = positions[1];
		account3.createDate = LocalDate.of(2019, 12, 23);
		
		Account[] accounts = {account1,account2,account3};
		
		return accounts;
	}
	
	public static Group[] addGroup() {
		Account[] accounts = addAccount();
		
		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "group so 1";
		group1.creator = accounts[0];
		group1.createDate = LocalDate.of(2019, 12, 25);

		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "group so 2";
		group2.creator = accounts[2];
		group2.createDate = LocalDate.of(2019, 12, 25);

		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "group so 3";
		group3.creator = accounts[1];
		group3.createDate = LocalDate.of(2019, 12, 25);
		
		Group[] groups = {group1,group2,group3};
		
		return groups;
	}
		
}
