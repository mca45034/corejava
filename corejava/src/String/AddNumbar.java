package String;

public class AddNumbar {
	public static void main(String[] args) {
		String s="rahulkirar9211@gmail.com";
		String s1=s.replace("rahulkirar9211@gmail.com", "9211");
		int s2=Integer.parseInt(s1);
		//System.out.println(s2);
		int rem=0,sum=0; 
		while(s2>0) {
		 rem=s2%10;
		 sum=sum+rem;
		 s2=s2/10;
		}
		System.out.println(sum);
			
		}
	}


