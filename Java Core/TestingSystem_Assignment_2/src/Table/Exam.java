package Table;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Exam {
	public int examID;
	public String code;
	public String title;
	public CategoryQuestion category;
	public short duration;
	public Account creator;
	public Date createDate;
	public Question[] questions;
	@Override
	public String toString() {
		Locale locale = new Locale("vi", "VN");
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateformat.format(createDate);
		
		return "Exam [examID=" + examID + ", code=" + code + ", title=" + title + ", category=" + category.categoryName
				+ ", duration=" + duration + ", creator=" + creator.fullName + ", createDate=" + date + ", questions="
				+ Arrays.toString(questions) + "]";
	}
	
	public String formatDateTimeForExam () {
		String pattern = "yyyy-MM-dd-HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(createDate);
		
		return code + ": " + date;
	}
	
	public String formatYearForExam () {
		String pattern = "yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(createDate);
		
		return code + ": " + date;
	}
	
	public String formatMonthYearForExam () {
		String pattern = "MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(createDate);
		
		return code + ": " + date;
	}
	
	public String formatMonthDateForExam () {
		String pattern = "MM-DD";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(createDate);
		
		return code + ": " + date;
	}
	

	
}
