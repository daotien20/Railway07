package Table;
import java.time.LocalDate;
import java.util.Arrays;

public class Account {
	public int accountID;
	public String email;
	public String userName;
	public String fullName;
	public Department department;
	public Position position;
	public LocalDate createDate;
	public Group[] groups;
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", department=" + department.departmentName + ", position=" + position.positionName + ", createDate=" + createDate
				+ ", groups=" + Arrays.toString(groups) + "]";
	}
	
	
}
