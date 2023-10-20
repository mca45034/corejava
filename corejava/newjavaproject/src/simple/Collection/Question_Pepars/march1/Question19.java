package march1;

public class Question19 {
	enum Directions

	{

	NORTH, SOUTH, EAST, WEST;

	Directions(){

	System.out.println("one direction");

	}

	}



	public static void main(String[] args)

	{

	Directions d1 = Directions.EAST;

	System.out.println(d1);

	Directions d2 = Directions.NORTH;

	System.out.println(d1);

	}

	}



