package in.com.Singal_Leval;

import java.util.Scanner;

class Arrya12 {
	//public static final String name="i am rays students..";
	
	public void arr1() {
		System.out.println("i am Arrays...");
		
	}
	public void disp() {
		System.out.println("find arrys i am perents......");
	}

}
 class Arry23 extends Arrya12{
	 int ar[];
	 int size;
	 int [] num;
	public void arr() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size..");
		 size=sc.nextInt();
		 System.out.println("Enter the number...");
		 num =new int[size];
		 
		 for(int i=0;i<size;i++) {
			 num[i]=sc.nextInt();
		 }
		 arr1();
		 
	 }
	 public void arr1() {
		 for(int i=0;i<size;i++) {
			System.out.println(num[i]);
		 }
	 }

 }
 public class Main_Methode{
	 
	 public static void main(String[] args) {
		 Arrya12 ae=new Arrya12();
		 ae.arr1();ae.disp();
		 Arry23 a=new Arry23();
		 //a.disp();
		 a.arr();
		 
		 
		
	}
	 
 }
