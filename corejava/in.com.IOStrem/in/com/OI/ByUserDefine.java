package in.com.OI;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ByUserDefine {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the text massege....");
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader line=new BufferedReader(reader);
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\IO\\user.txt");
		PrintWriter print=new  PrintWriter(file);
		String s=line.readLine();
		while(!(s.equals("!"))) {
			print.println(s);
			s=line.readLine();
		}
		System.out.println("compiler are done...");
		//file.flush();
		reader.close();
		line.close();
		file.close();
		print.close();
		
	}

}
