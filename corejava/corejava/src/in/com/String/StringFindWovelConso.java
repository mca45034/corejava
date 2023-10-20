package in.com.String;

public class StringFindWovelConso {
	public static void main(String[] args) {
		String str="by the end century the revolution took pleace this time in hence france";
		String str1=str.toLowerCase();
		char ch[]=str1.toCharArray();
		int Ccount=0;
		int Vcount=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' ||ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				Vcount++;
			}
			else {
				Ccount++;
			}
		}
		System.out.println(Vcount);
		System.out.println(Ccount);
		System.out.println(ch.length);
	}

}
