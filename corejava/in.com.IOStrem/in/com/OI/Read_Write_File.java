package in.com.OI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_File {

	public static void main(String[] args) {
				File myfile=new File("Importent.txt");
				try {
					myfile.createNewFile();
				} catch (IOException e) {
					System.out.println("file not found");
					e.printStackTrace();
				}
//				try {
//				  FileWriter f=new FileWriter(myfile);
//				  f.write("dsfeberher greb ergerhg herg erherg regerg gerge " );
//				  f.close();
//				} catch (IOException e) {
//					System.out.println("file not found");
//					e.printStackTrace();
//				}
//				 try {
//				      File myObj = new File("filename.txt");
//				      if (myObj.createNewFile()) {
//				        System.out.println("File created: " + myObj.getName());
//				      } else {
//				        System.out.println("File already exists.");
//				      }
//				    } catch (IOException e) {
//				      System.out.println("An error occurred.");
//				      e.printStackTrace();
//				    }
				
//				try {
//				      File myObj = new File("filename.txt");
//				      Scanner myReader = new Scanner(myObj);
//				      while (myReader.hasNextLine()) {
//				        String data = myReader.nextLine();
//				        System.out.println(data);
//				      }
//				      myReader.close();
//				    } catch (FileNotFoundException e) {
//				      System.out.println("An error occurred.");
//				      e.printStackTrace();
//				    }
//				 File myObj = new File("C:\\Users\\MyName\\Test"); 
//				    if (myObj.delete()) { 
//				      System.out.println("Deleted the folder: " + myObj.getName());
//				    } else {
//				      System.out.println("Failed to delete the folder.");
//				    } 
//					

	}

}
