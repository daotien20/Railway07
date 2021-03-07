package frontend;

import entity.Ex5_Student;
import utils.FileManager;
import utils.IOStream;

public class RunEx5_Student {

	public static void main(String[] args) throws Exception {
//		FileManager.createNewFile("C:\\Users\\admin\\Desktop\\VTI ACA\\ StudentInformation.txt");
		Ex5_Student student = new Ex5_Student();
		IOStream.writeFile("C:\\Users\\admin\\Desktop\\VTI ACA\\StudentInformation.txt", student.inforStudent().toString(), false);
	}

}
