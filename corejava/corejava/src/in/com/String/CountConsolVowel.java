package in.com.String;

public class CountConsolVowel {

	public static void main(String[] args) {
		String str="Exception handling ensures that the program's flow does not break when an exception occurs. For example, suppose a program contains many statements, and an exception occurs in the middle of executing some of them. In that case, the statements following the exception will not be executed, and the program will terminate abruptly";
		String str2=str.replace(" ", "");
		char ch[]=str2.toCharArray();
		int Ccount=0;
		int Vcount=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				Vcount++;
			}
			else if (ch[i]>'a' || ch[i]<'z') {
				Ccount++;
			}
			
			
		}
		System.out.println(Vcount);
		System.out.println(Ccount);
		System.out.println(ch.length);

	}

}
