package entity;

public class Department {
	public int    departmentID;
	public String departmentName;
	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}
	public boolean equals(Department department2) {
		if(departmentName == department2.departmentName) {
			return true;	
		}else {
		return false;
		}
	}

}
