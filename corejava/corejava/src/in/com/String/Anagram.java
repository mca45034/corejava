package in.com.String;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="KeEp";
		String str1="PeeK";
		String s1=str.toLowerCase();
		String s2=str1.toLowerCase();
		char []ch=s1.toCharArray();
		char []ch1=s2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(ch[i]>ch[j]) {
					char tmp=ch[i];
					ch[i]=ch[j];
					ch[j]=tmp;
				}
			}
			System.out.println(ch[i]);
			
		}
		

	}

}
