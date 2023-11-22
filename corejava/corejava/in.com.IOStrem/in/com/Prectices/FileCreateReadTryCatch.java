package in.com.Prectices;

import java.io.File;
import java.io.FileWriter;

public class FileCreateReadTryCatch {

	public static void main(String[] args) {
		File file=new File("user.java");
		try {
			file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("done");
		
		try {
			FileWriter myfile=new FileWriter(file);
			myfile.write("my name is rahul kirar "
					+ "my college name is bit"
					+ "now a days pursuing on internship in rays technologies");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ok");

	}

}
