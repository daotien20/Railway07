package backend;

public class MyMath {
	public static int min(int a, int b) {
		if(a - b >= 0) {
			return b;
		}else {
			return a;
		}
		
	}
	
	public static int sum(int a, int b) {
		return a + b;
		
	}
	
	public static int max(int a, int b) {
		if(a - b >= 0) {
			return a;
		}else {
			return b;
		}
		
	}
}
