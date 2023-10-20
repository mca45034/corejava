package in.com.Uncheacked_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_hendling {

	public static void main(String[] args)  throws IOException{
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("E:\rahul.txt");
			System.out.println("file is found.");
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		finally {
			fis.close();
		}
		System.out.println("reset the code");

	}

}
