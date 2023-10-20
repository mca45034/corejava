package Strings;

public class Important {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rahul kumar kirar";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o'|| ch[i]=='u') {
				if(ch[i]>=97 && ch[i]<=122) {
					ch[i]=(char) ((char) ch[i]-32);
				}
			}
			System.out.print(ch[i]);
		}

	}

}
