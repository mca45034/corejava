package HashMap1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindAge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the name : ");
		System.out.println("Enter the age :");
		int ageGreter=18;
		String flage;
		HashMap<String,Integer>al=new HashMap<>();
		HashMap<String,String> al2=new HashMap<>();
		al.put(sc.next(), sc.nextInt());
		al.put(sc.next(), sc.nextInt());
		al.put(sc.next(), sc.nextInt());
		al.put(sc.next(), sc.nextInt());
		al.put(sc.next(), sc.nextInt());
		
		Set<Entry<String,Integer>> all=al.entrySet();
		for(Map.Entry<String, Integer>map:all) {
			String s=map.getKey();
			Integer i=map.getValue();
			if(i>ageGreter)
				flage="you are yuva";
			else
				flage="you are smaller";
			al2.put(s, flage);
			
		}
		Set<Entry<String,String>> al3=al2.entrySet();
		for(Map.Entry<String, String>map1:al3) {
			String s1=map1.getKey();
			String i1=map1.getValue();
			System.out.println(s1+" "+i1);
		
		}
	}

}
