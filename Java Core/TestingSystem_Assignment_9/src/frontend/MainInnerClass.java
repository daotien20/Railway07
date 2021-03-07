package frontend;

import entity.OuterClass;
import entity.OuterClass.InnerClass;

public class MainInnerClass {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.show();
		
		InnerClass innerClass = outerClass.new InnerClass();
		innerClass.show();
	}

}
