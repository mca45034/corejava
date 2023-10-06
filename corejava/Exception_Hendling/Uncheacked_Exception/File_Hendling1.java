package Uncheacked_Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Hendling1 {

	public static void main(String[] args) {
		File myFile=new File("rahulk.java");
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			System.out.println("unable to this file");
			e.printStackTrace();
		}
		try {
			FileWriter filewriter =new FileWriter("rahulk.java");
			filewriter.write("by the century the revolution took please this time in hance france");
			filewriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
