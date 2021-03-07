package entity;

public class MyNumber <N extends Number> {
	private N number;

	public MyNumber(N number) {
		super();
		this.number = number;
	}

	public MyNumber() {
		super();
	}

	public N getNumber() {
		return number;
	}

	public void setNumber(N number) {
		this.number = number;
	}
	

}
