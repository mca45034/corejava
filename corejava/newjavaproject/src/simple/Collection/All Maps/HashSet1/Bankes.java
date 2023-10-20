package HashSet1;

public class Bankes implements Comparable<Bankes> {
	int id;
	String name;
	int m_no;
	String location;
	public Bankes(int id, String name, int m_no, String location) {
		super();
		this.id = id;
		this.name = name;
		this.m_no = m_no;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Bankes [id=" + id + ", name=" + name + ", m_no=" + m_no + ", location=" + location + "]";
	}
	@Override
	public int compareTo(Bankes o) {
		if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
			return -1;
		
		return 0;
	}
}
