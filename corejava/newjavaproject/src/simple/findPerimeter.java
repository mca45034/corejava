package simple;
import java.util.Scanner;
public class findPerimeter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length : ");
		int length = sc.nextInt();
	   System.out.println("Enter the Breath : ");
	   int breath = sc.nextInt();
	   int perimeter = 2*(length + breath);
	   System.out.println("Perimeter of the Reacangle : " + perimeter);
	}

}
