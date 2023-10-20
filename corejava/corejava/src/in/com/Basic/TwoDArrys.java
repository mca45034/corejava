package in.com.Basic;

public class TwoDArrys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tab[][]=new int [5][5];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				tab[i][j]=(i)*(j);
				System.out.print(tab[i][j]+"\t");
			}
			System.out.println();
			
		}

	}

}
