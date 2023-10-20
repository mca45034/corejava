package in.com.OI;

import java.io.File;

public class Delete_File {

	public static void main(String[] args) {
		File myfile=new File("C:\\Users\\HP\\Desktop\\IO\\File.txt");
		if(myfile.delete()) {
			System.out.println("Delete file are"+  myfile.getName());
		}
		else {
			System.out.println("not delete");
		}
		System.out.println("done");

	}

}
