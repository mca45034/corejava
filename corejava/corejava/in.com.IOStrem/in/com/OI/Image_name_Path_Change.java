package in.com.OI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image_name_Path_Change {

	public static void main(String[] args) throws IOException {
		FileInputStream input=new FileInputStream("C:\\Users\\HP\\Pictures\\Screenshots\\p2.png");
		FileOutputStream output=new FileOutputStream("C:\\Users\\HP\\Desktop\\IO\\new.jpg");
		int ch=input.read();
		while(ch !=-1) {
			output.write(ch);
			ch=input.read();
		}
		input.close();
		output.close();
		System.out.println("done");

	}

}
