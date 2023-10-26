package in.com.String;

import java.util.Arrays;

public class RevarsString {
	public static void main(String[] args) {
		String s="raHul kIRar";
		String s1=s.toUpperCase();
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			char tmp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=tmp;
		}
		s=Arrays.toString(ch);
		System.out.println(s);
	}

}
