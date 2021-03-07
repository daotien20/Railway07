package entity;

public class Salary<T> {
	private int month;
	private T luongThang;
	public Salary(int month, T luongThang) {
		super();
		this.month = month;
		this.luongThang = luongThang;
	}
	public Salary() {
		super();
	}
	public Salary(int i) {
	}
	public int getMonth() {
		return month;
	}
	public T getLuongThang() {
		return luongThang;
	}
	public void setMonth(int i) {
		this.month = i;
	}
	public void setLuongThang(T luongThang) {
		this.luongThang = luongThang;
	}

	
	
	
}
