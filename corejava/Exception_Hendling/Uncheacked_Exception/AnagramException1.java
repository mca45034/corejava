
package Uncheacked_Exception;
class AnagramException extends RuntimeException{
	public AnagramException(String s) {
		super(s);
	}
	public AnagramException() {
		this("not a Anagram");
	}
	public void anagram(String s,String t) {
		int flage=0;
		int count=0;
		char ch[]=s.toCharArray();
		char ch1[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]>ch[j]) {
					char tmp=ch[i];
					ch[i]=ch[j];
					ch[j]=tmp;
				}
			}
		}
//		for (int i = 0; i < ch.length; i++) {
//			System.out.println(ch[i]);
//		}
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch1.length; j++) {
				if(ch1[i]<ch1[j]) {
					char tmp1=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=tmp1;
				}
			}
		}
//		for (int i = 0; i < ch1.length; i++) {
//			System.out.println(ch1[i]);
//		}
		for (int i = 0; i < ch1.length; i++) {
			if(ch[i]==ch1[i]) {
				count++;
				flage=1;
			}
		}
		if(flage==1 && count==ch1.length) {
			System.out.println("anagram");
		}
		else {
			throw new AnagramException();
		}
		
	}
}

public class AnagramException1 {
	public static void main(String[] args) {
		AnagramException a=new AnagramException("not anagram");
		String s="keep";
		String t="peek";
		try {
			a.anagram(s, t);
		} catch (AnagramException e) {
			System.out.println(e.getMessage());
		}
		
	}	
}
