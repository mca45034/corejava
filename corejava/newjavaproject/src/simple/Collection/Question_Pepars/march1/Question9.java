package march1;

import java.util.HashMap;

public class Question9 {

	public static void main(String[] args) {
		String s= "Nothing is as easy as it looks Nothing" ;
		HashMap<Character,Integer>hm=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char str=s.charAt(i);
			int count=1;
			if(hm.containsKey(str)) {
				Integer in=hm.get(str);
				count=count+1;
				hm.put(str, in);
			}
			else {
				hm.put(str,1);
			}
		}
		System.out.println(hm);
		System.out.println("my namer is rahul kirar");

	}

}
