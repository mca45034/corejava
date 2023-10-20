package Strings;

public class AllStringCount {

	public static void main(String[] args) {
		String s="by the end 18th century the revolution took pleace this time in hence france";
		String s1=s.toLowerCase();
		char ch[]=s1.toCharArray();
		int Vcount=0,Ccount=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				Vcount++;
			}
			else if(ch[i]>='a' && ch[i]<='z') {
				Ccount++;
			}
		}
		System.out.println("Vovel is..."+Vcount);
		System.out.println("Consonent is.."+Ccount);
		System.out.println("total length is.."+s.length());

	}

}
