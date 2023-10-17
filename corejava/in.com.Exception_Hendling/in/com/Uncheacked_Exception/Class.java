package in.com.Uncheacked_Exception;

public class Class {

	public static void main(String[] args) {
		String s="Robert Brett Roser";
		int space=0,i;
		char ch[]=s.toCharArray();
		
		System.out.print(ch[0]+".");
		
		for(i=0;i<ch.length;i++)
		{
			
			if(ch[i]==' ')
			{
				
				if(space<1)
					System.out.print(ch[i+1]+".");
					space++;
					
				
				if(space>1)
				{
                
				
				System.out.print(ch[i+1]);
				break;
			}
			}
			
			else if(ch[i]!=' ')
			{
				continue;
			}
				
		}
		
		
		for(int j=i+2;j<ch.length;j++)
		{
			System.out.print(ch[j]);
		}

	
	}

}
