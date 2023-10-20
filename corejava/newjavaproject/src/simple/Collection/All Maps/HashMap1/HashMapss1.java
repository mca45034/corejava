package HashMap1;

import java.util.HashMap;

public class HashMapss1 {
	public static void main(String[] args) {
		HashMap<Character ,String> hm=new HashMap<>();
		hm.put('A', "Sham");
		hm.put('B', "Ram");
		hm.put('C', "Aaru");
		hm.put('D', "Lucy");
		hm.put('E', "Zack");
		hm.put('F', "Bob");
		hm.put('G', "Neno");
		hm.put('H', "bolo");
		hm.put('J', "Moto");
		String s=hm.get('J');
		System.out.println(s);
		

	}
}
