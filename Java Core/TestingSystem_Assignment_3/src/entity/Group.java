package entity;
import java.time.LocalDate;

public class Group {
	public int groupID;
	public String groupName;
	public Account creator;
	public LocalDate createDate;
	public Account[] accounts;
}
