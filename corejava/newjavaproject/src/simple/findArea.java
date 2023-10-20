package simple;
import java.util.Scanner;
public class findArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		int length = sc.nextInt();
		System.out.print("Enter the breath : ");
		int breath = sc.nextInt();
	     int area = length * breath;
	     System.out.println("Area of Reactangle : " +area);
	}

}
