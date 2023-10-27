package in.com.OI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReader2 {

	public static void main(String[] args) throws IOException {
		FileReader reader =new FileReader("C:\\Users\\HP\\Desktop\\IO\\Name.txt");
		Scanner sc=new Scanner(reader);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		sc.close();
		reader.close();
	}

}
