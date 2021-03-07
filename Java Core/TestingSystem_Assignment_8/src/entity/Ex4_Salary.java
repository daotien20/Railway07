package entity;

public class Ex4_Salary <N extends Number> {
	private N salary;

	public Ex4_Salary(N salary) {
		super();
		this.salary = salary;
	}

	public N getSalary() {
		return salary;
	}

	public void setSalary(N salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Ex4_Salary [salary=" + salary + "]";
	}
	
}
