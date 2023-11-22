package in.com.Prectices;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class User_Difine {

	public static void main(String[] args) throws IOException {
		System.out.println("enter the txt here...");
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader buffer=new BufferedReader(input);
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\IO\\io2\\User.txt");
		PrintWriter print=new PrintWriter(file);
		String s=buffer.readLine();
		while(!(s.equals("!"))) {
			print.println(s);
			s=buffer.readLine();
		}
		input.close();buffer.close();file.close();print.close();

	}

}
