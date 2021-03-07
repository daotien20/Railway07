package backend;

import java.util.Date;

public class Annotations {
	
	public Date question1() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2020, 05, 28);
		return date;
	}
}
