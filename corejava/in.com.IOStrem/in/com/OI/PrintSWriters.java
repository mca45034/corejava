package in.com.OI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintSWriters {

	public static void main(String[] args) throws IOException {
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\IO\\print.txt");
		PrintWriter line= new PrintWriter(file);
		line.println("my name rahul kirar");
		line.println("i have a done my bsc cs is davv indore");
		line.println("i have a completed my mca is 8 month ago  from noida");
		file.close();
		line.close();
		System.out.println("file successfully uplod");

	}

}
