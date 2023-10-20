package HashMap1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Parcentege {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name :");
		System.out.println("Enter the Number : ");
		int pasmark=45;
		String res;
		HashMap<String,Integer> al=new HashMap<>();
		HashMap<String,String> al1=new HashMap<>();
		al.put(sc.next(), sc.nextInt());
		al.put(sc.next(), sc.nextInt());
		al.put(sc.next(), sc.nextInt());
		al.put(sc.next(), sc.nextInt());
		al.put(sc.next(), sc.nextInt());
		Set<Entry<String,Integer>> se=al.entrySet();
		for(Map.Entry<String,Integer> map : se) {
			String s=map.getKey();
			Integer i=map.getValue();
			if(i> pasmark)
				res="pass";
			else
				res="fail";
			al1.put(s, res);
				
		}
		Set<Entry<String, String>> alv=al1.entrySet();
		for(Entry<String, String> map1:alv) {
			String s1=map1.getKey();
			String i1=map1.getValue();
			System.out.println(s1+" "+i1);
		}
		

	}
}
