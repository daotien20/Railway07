package frontend;

import java.io.FileOutputStream;

import utils.IOStream;

public class RunIOStream {

	public static void main(String[] args) throws Exception {
		IOStream.readFile("C:\\Users\\admin\\Desktop\\VTI ACA\\file4.txt");
		
		String content = "True or False";
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\admin\\Desktop\\VTI ACA\\file4.txt", false);
		fileOutputStream.write(content.getBytes());
		fileOutputStream.close();
		
		
	}

}
