package in.com.OI;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ByUserDefine2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the text right...");
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader bline=new BufferedReader(reader);
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\IO\\user1.txt");
		PrintWriter pri=new PrintWriter(file);
		String s1=bline.readLine();
		if(!(s1.equals("."))) {
			pri.println(s1);
			s1=bline.readLine();
		}
		else {
			System.out.println("Complier are stop in use . sign");
			reader.close();
			bline.close();
			file.close();
			pri.close();
		}
		
	}

}
