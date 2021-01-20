package Program;

public class RunBoxingUnboxing {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		
	}

	private static void question3() {
		Integer s = new Integer("12345674");
		int x = s;
		System.out.println(x);
		System.out.println("");
	}

	private static void question2() {
		String s = "1234567";
		int x = Integer.parseInt(s);
		System.out.println(x);
		System.out.println("");
	}

	private static void question1() {
		Integer luong = new Integer(5000);
		float x = luong.floatValue();
		System.out.printf("%.2f %n", x);
		System.out.println("");
	}

}
