package Strings;

import java.util.Arrays;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rahul kumar";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			char tmp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=tmp;
		}
		s=Arrays.toString(ch);
		System.out.println(s);

	}

}
