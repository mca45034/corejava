package in.com.Prectices;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderascii {

	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("C:\\Users\\HP\\Desktop\\IO\\io2\\disp.txt");
		int s=file.read();
		while(s != -1) {
			System.out.print((char)s);
			s=file.read();
		}
		file.close();
	}

}
