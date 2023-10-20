package Strings;

public class Importent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rahulkirar@9211";
		String s1=s.replace("rahulkirar@9211", "9211");
		System.out.println(s1);
		int num=Integer.parseInt(s1);
		int rem=0,sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);

	}

}
