package String;

public class Example1 {

	public static void main(String[] args) {
		int many=1337;
		int count=0;
		int note[]= {500,200,100,50,20,10,5,2,1};
		for (int i = 0; i < note.length; i++) {
			count=many/note[i];
			if(count>0) {
				System.out.println(note[i]+" "+count);
			}
			many=many%note[i];
		}
		
		
	}

}
