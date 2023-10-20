package Assigment;

import java.util.LinkedList;

public class Assigment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList <String> c1 = new LinkedList <String> ();
         c1.add("Red");
       c1.add("Green");
       c1.add("Black");
       c1.add("White");
       c1.add("Pink");
       System.out.println(c1);
       String y=c1.peekLast();
       String z=c1.poll();
       System.out.println(z);
       System.out.println(y);
       System.out.println(c1);

	}

}
