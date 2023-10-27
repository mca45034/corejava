package in.com.OI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile_Read_Write {

	public static void main(String[] args) {
		File myFile=new File("Name.txt");
		try {
			myFile.createNewFile();
		} catch (Exception e) {
			System.out.println("not create file");
			e.printStackTrace();
		}
		System.out.println("done");
		try {
			FileWriter file=new  FileWriter(myFile);
			file.write("hello ,,"
					+ "i am alexa "
					+ "and i am whate help you");
			file.close();
		} catch (IOException e) {
			System.out.println("not write file");
			e.printStackTrace();
		}

	}

}
