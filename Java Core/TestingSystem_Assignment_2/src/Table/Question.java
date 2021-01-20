package Table;
import java.time.LocalDate;

public class Question {
	public int questionID;
	public String content;
	public CategoryQuestion category;
	public TypeQuestion type;
	public Account creator;
	public LocalDate createDate;
	public Exam[] exams;
}
