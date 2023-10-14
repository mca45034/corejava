package Hash_Mapss;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age..");
		System.out.println("Enter the name..");
		int age=18;
		String flage;
		HashMap<Integer,String>hm=new HashMap<>();
		HashMap<String,String>hm1=new HashMap<>();
		hm.put(sc.nextInt(), sc.next());
		hm.put(sc.nextInt(), sc.next());
		hm.put(sc.nextInt(), sc.next());
		
		Set<Entry<Integer,String>>set=hm.entrySet();
		for(Entry<Integer, String> map:set) {
			Integer i=map.getKey();
			String s=map.getValue();
			if(i>18) {
				flage="you are yuva";
				hm1.put(s, flage);
			}
			else {
				flage="you are smaller";
				hm1.put(s, flage);
			}
		}
		Set<Entry<String,String>>set1=hm1.entrySet();
		for(Map.Entry<String, String>map:set1) {
			String s1=map.getKey();
			String i1=map.getValue();
			System.out.println(s1+" "+i1);
		}

	}

}
