package frontend;

public class TestQ1_2 {

	public static void main(String[] args) {
		try {
			System.out.println(divide(7,0));
			
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println("can not devide 0");
		} finally {
			System.out.println("divide completed");
		}
	}
	


	public static float divide(int a, int b) {
		return a/b;
	}
}


