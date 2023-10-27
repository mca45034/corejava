package in.com.OI;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test_Main2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the text here..");
		InputStreamReader reader =new InputStreamReader(System.in);
		BufferedReader line=new BufferedReader(reader);
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\IO\\rahul.txt");
		PrintWriter pri=new PrintWriter(file);
		String s=line.readLine();
		while(!(s.equals("!"))) {
			pri.println(s);
			s=line.readLine();
		}
		reader.close();line.close();line.close();pri.close();
		System.out.println("done");

	}

}
