package in.com.OI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		FileReader file=new  FileReader("C:\\Users\\HP\\Desktop\\IO\\Name.txt");
		BufferedReader line =new BufferedReader(file);
		String s=line.readLine();
		while(s != null) {
			System.out.println(s);
			s=line.readLine();
		}
		file.close();
		line.close();
	}

}
