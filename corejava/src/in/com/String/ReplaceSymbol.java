package in.com.String;

public class ReplaceSymbol {
	public static void main(String[] args) {
		String str="Rahul Kirar";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='i'|| ch[i]=='a' || ch[i]=='h') {
				ch[i]='%';
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}

}
