package in.com.OI;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\IO\\Dev.txt");
		file.write("iugwiud riuewy riuew riyweiur iuewyriu ur uewhr ");
		file.close();
		System.out.println("done");

	}

}
