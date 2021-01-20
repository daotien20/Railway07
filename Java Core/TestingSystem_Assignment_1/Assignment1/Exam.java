package Assignment1;
import java.time.LocalDate;

public class Exam {
	int examID;
	String code;
	String title;
	CategoryQuestion category;
	short duration;
	Account creator;
	LocalDate createDate;
	Question[] questions;
}
