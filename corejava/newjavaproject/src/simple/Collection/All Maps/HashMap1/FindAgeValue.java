package HashMap1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindAgeValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the age : ");
		System.out.println("Enter the name :");
		int ageGreter=18;
		String flage;
		HashMap<Integer,String>al=new HashMap<>();
		HashMap<String,String> al2=new HashMap<>();
		al.put(sc.nextInt(), sc.next());
		al.put(sc.nextInt(), sc.next());
		al.put(sc.nextInt(), sc.next());
		al.put(sc.nextInt(), sc.next());
		Set<Entry<Integer,String>> all=al.entrySet();
		for(Entry<Integer, String> map:all) {
			Integer s=map.getKey();
			String i=map.getValue();
			if(s>ageGreter)
				flage="you are yuva";
			else
				flage="you are smaller";
			al2.put(i, flage);
			
		}
		Set<Entry<String,String>> al3=al2.entrySet();
		for(Map.Entry<String, String>map1:al3) {
			String s1=map1.getKey();
			String i1=map1.getValue();
			System.out.println(s1+" "+i1);
		
		}
	}

}
