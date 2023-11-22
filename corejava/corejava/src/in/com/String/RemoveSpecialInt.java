package in.com.String;

public class RemoveSpecialInt {

	public static void main(String[] args) {
		String s="rahulkumar@123gmail.com";
//		String s1=s.replaceAll("@123.","");
//		String s2=s1.replace(".", "");
//		System.out.println(s2);
		int sum=1;
		int count=0;

		for( char i = 'a'; i < 'z'; i++) {
			
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)==i) {
					sum=count;
					count++;
				}
				
			}

		}
		System.out.println(sum);
		

	}

}
