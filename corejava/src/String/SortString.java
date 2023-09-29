package String;

public class SortString {
	public static void main(String[] args) {
		String str[]= {"india","china","usa","kenada","landan","japan"};
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].charAt(0)<str[i].charAt(0)) {
					String tmp=str[i];
					str[i]=str[j];
					str[j]=tmp;
				}
			}
			
		}
		System.out.println("sort the cuntry : ");
		for(int i=0;i<str.length/2;i++) {
			
			System.out.println(str[i]);
		}
	}

}
