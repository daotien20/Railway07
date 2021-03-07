package frontend;

import utils.FileManager;

public class DownloadFile {

	public static void main(String[] args) throws Exception {
		FileManager.downloadFile("https://drive.google.com/drive/folders/1lXC8AaGOYH73LqfLsxmDN6uvsmARkDnx", "C:\\Users\\admin\\Desktop\\VTI ACA\\Class");
	}

}
