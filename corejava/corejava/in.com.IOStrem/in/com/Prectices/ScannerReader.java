package in.com.Prectices;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReader {

	public static void main(String[] args) throws IOException  {
		FileReader file=new FileReader("C:\\Users\\HP\\Desktop\\IO\\io2\\con.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		file.close();
		sc.close();
	}

}
