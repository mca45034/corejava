package march1;

import java.util.Arrays;

public class Question4 {
	public static void revers(String s) {
		char str[]=s.toCharArray();
		
		for(int i=0;i<str.length/2;i++) {
			char tmp=str[i];
			str[i]=str[str.length-i-1];
			str[str.length-i-1]=tmp;
		}
		s=Arrays.toString(str);
		System.out.print(str);
		System.out.print(" ");
	}

	public static void main(String[] args) {
		String s[]= {"Help","other"};
		Question4 q=new Question4();
		for(int i=0;i<s.length;i++) {
			revers(s[i]);
		}

	}

}
