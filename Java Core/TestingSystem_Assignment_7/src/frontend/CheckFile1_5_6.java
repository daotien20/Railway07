package frontend;

import java.io.File;
import java.util.List;

import utils.FileManager;
public class CheckFile1_5_6 {

	public static void main(String[] args) throws Exception {
		System.out.println(new File("C:\\devlist.txt").exists());
		System.out.println(new File("C:\\devlist.txt").isDirectory());
		System.out.println(FileManager.isFileExists("C:\\devlist.txt"));
		
		List<String> listOfFolder = FileManager.getAllFileName("C:\\xampp");
		
		for(String string : listOfFolder) {
			System.out.println(string);
		}
	}

}
