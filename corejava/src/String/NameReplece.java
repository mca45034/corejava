package String;

public class NameReplece {

	public static void main(String[] args) {
		String s="rahul kumar kirar";
		int count=0;
		char ch[]=s.toCharArray();
		for (int i = 1; i < ch.length; i++) {
			if(ch[i]==' ') {
				if(count>=1) {
					System.out.println(ch[i]+".");
					count++;
					
				}
				if(count>=1) {
					System.out.println(ch[i]);
					break;
				}
				else if(ch[i] !=' ') {
					
				}
			}
			
			
		}
		int i = 0;
		for ( i = i+2; i < ch.length; i++) {
			System.out.println(ch[i]);
			
		}

	}

}
