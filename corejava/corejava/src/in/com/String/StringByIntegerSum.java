package in.com.String;

public class StringByIntegerSum {

	public static void main(String[] args) {
//		String s="malayalam";
//		for (char i = 'a'; i <='z'; i++) {
//			int count=0;
//			for (int j = 0; j < s.length(); j++) {
//				if(s.charAt(j)==i) {
//					count++;
//				}
//				
//				
//			}
//			if(count>0) {
//				System.out.println(i+"-"+count);
//			}
//			
//		}
//		String str = "abc1d2e";
//
//		int sum = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//
//			if (Character.isDigit(str.charAt(i))) {
//
//				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
//
//			}
//
//		}
//
//		System.out.println(sum);
		
		String s="rahu2lkuma4r";
		int sum=0;
		(int i = 0; i <= 9; i++) {
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if(i==j) {
					count++;
					sum=sum+j;
				}
				
				
			}
			if(count>0) {
				System.out.println(i+"-"+count);
				System.out.println(sum);
			}
			
			
		}

	}

}
