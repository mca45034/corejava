package Get_Set;

public class School {
	public static  String name="DPS";
	int room;
	int staff;
	String principal;
	int bus;
	int student;
	public School(int room, int staff, String principal, int bus, int student) {
		super();
		this.room = room;
		this.staff = staff;
		this.principal = principal;
		this.bus = bus;
		this.student = student;
	}
	  
	public void Display1() {
		System.out.println("Total rooms in school : "+room);
		System.out.println("Total staff in school : "+staff);
		System.out.println("Principal name in school : "+principal);
		System.out.println("Total bus in school : "+bus);
		System.out.println("Total Student in school : "+student);
	}

}
