package in.com.ImportentClasses;

public class SystemSecurityManager {

	public static void main(String[] args) {
		SecurityManager  sm=System.getSecurityManager();
		if(sm==null) {
			System.out.println("SecurityManager  is not configrades.. : ");
		}
		sm=new SecurityManager();
		System.out.println(sm);
		sm=new SecurityManager();
		if(sm != null) {
			System.out.println("SecurityManager  is configrades.. : ");
		}

	}

}
