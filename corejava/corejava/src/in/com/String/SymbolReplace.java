package in.com.String;

public class SymbolReplace {

	public static void main(String[] args) {
		String name="rahul kumar";
		//output--@a@@l k@ma@
		char ch[]=name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='r' || ch[i]=='h' || ch[i]=='u') {
				ch[i]='@';
			}
			
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}

}
