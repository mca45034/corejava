package HashMap1;

import java.util.HashMap;

public class Iterator {
	public static void main(String[] args) {
		HashMap<Long,String> hm=new HashMap<>();
		hm.put(1234567L, "Sham");
		hm.put(12345674L, "Ram");
		hm.put(12234567L, "Aaru");
		hm.put(891234567L, "Lucy");
		hm.put(981234567L, "Zack");
		hm.put(1237654567L, "Bob");
		hm.put(1456234567L, "Neno");
		hm.put(1234567876L, "bolo");
		hm.put(123234567L, "Moto");
		String s=hm.get(1234567L);
		System.out.println(s);

	}
}
