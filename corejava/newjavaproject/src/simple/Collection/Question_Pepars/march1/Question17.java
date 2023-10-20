package march1;
 class SomeClass{ 
	int intVar = 0;


 String strVar = "InnerClassExample";
private int intPvt = 4 ;
public static int intStatic = 61;
private static String strPvtStatic = " java";  
private void printVar(){

System.out.println(intVar + " "+ strVar + " " + intPvt);

}

 class Nested {

public void printStaticInnerVar(){

System.out.println(" variable from outer class "+intPvt); //1

System.out.println(" static variable from outer class "+ intStatic);// 2

System.out.println(" I am from static inner class"); //3

}

}

public class InnerClass {

int intInner = 9 ; //4

 static int num = 0 ; //5

static final int numConstant = 10 ; //6

String strInner = " I am string in innerclass";
}

  void printInnerVar(){

System.out.println(" I am from inner class "+strVar );

}

}

public class Question17 {
	
	public static void main(String[] args) {  
		march1.SomeClass.Nested sn=new march1.SomeClass.Nested();
	sn.printStaticInnerVar(); //7

	SomeClass icd = new SomeClass();


	SomeClass.InnerClass inObj = new march1.SomeClass.InnerClass();
	inObj.printInnerVar();

}


}
