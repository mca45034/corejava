package in.com.OI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageSearch {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\HP\\Desktop\\IO\\sort.jpg");
		FileOutputStream fs=new FileOutputStream("D:\\p.jpg");
		int ch=f.read();
		while(ch != -1) {
			fs.write(ch);
			ch=f.read();
		}
		f.close();fs.close();
		System.out.println("done");

	}

}
