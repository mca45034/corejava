package in.com.OI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReader {
	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("C:\\Users\\HP\\Desktop\\IO\\file handling refers.txt");
		Scanner sc=new Scanner(file);
		//String s=sc.nextLine();
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		file.close();
		sc.close();
	}

}
