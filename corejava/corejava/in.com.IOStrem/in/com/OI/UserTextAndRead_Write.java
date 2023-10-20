package in.com.OI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserTextAndRead_Write {

	public static void main(String[] args) {
		File myfile=new File("file.java");
		try {
			myfile.createNewFile();
		} catch (IOException e) {
			System.out.println("file not found...");
			e.printStackTrace();
		}
		try {
			FileWriter f=new FileWriter("file.java");
			f.write("by the end 18th cetury the revolution took please thise time in hance france..");
			f.close();
		} catch (IOException e) {
			System.out.println("file not found..");
			e.printStackTrace();
			
		}
		

	}

}
