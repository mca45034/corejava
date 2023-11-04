package in.com.OI;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ByUserDefine3 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter you text here...");
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader line=new BufferedReader(reader);
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\IO\\sham.txt");
		PrintWriter print=new PrintWriter(file);
		String s=line.readLine();
		while(!(s.equals("stop"))) {
			print.println(s);
			s=line.readLine();
			
		}
		reader.close();line.close();file.close();print.close();
		System.out.println("ok");

	}

}
