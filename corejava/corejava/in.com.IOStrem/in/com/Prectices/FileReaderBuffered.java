package in.com.Prectices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBuffered {

	public static void main(String[] args) throws IOException {
    FileReader file=new FileReader("C:\\Users\\HP\\Desktop\\IO\\io2\\system.txt");
    BufferedReader b=new BufferedReader(file);
    String s=b.readLine();
    while(s !=null) {
    	System.out.println(s);
    	s=b.readLine();
    }
    file.close();
    b.close();

	}

}
