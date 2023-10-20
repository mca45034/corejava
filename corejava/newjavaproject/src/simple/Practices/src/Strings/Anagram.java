package Strings;

public class Anagram {
	public static void main(String[] args) {
		String s="silent";
		String s1="listen";
		String str1=s.toLowerCase();
		String str2=s1.toLowerCase();
		char ch[]=str1.toCharArray();
		int count=0,flage=0;
		char ch1[]=str2.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char tmp=ch[i];
					ch[i]=ch[j];
					ch[j]=tmp;
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		for(int i=0;i<ch1.length;i++) {
			for(int j=i+1;j<ch1.length;j++) {
				if(ch1[i]>ch1[j]) {
				char tmp1=ch1[i];
				ch1[i]=ch1[j];
				ch1[j]=tmp1;
			}
			}
			
		}
		System.out.println("");
		for(int i=0;i<ch1.length;i++) {
			System.out.print(ch1[i]);
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==ch1[i]) {
				count++;
				flage=1;
				
			}
		}
		System.out.println("");
		if(flage==1 && count==ch.length) {
			System.out.print("Anagram");
		}
		else {
			System.out.print("Not Anagram");
		}
	}
}
