package in.com.Hash_set;

import java.util.HashSet;

public class Bankers implements Comparable<Bankers>{
	int id;
	String name;
	int mo_no;
	String location;
	public Bankers(int id, String name, int mo_no, String location) {
		super();
		this.id = id;
		this.name = name;
		this.mo_no = mo_no;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Bankers [id=" + id + ", name=" + name + ", mo_no=" + mo_no + ", location=" + location + "]";
	}
	@Override
	public int compareTo(Bankers o) {
		if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
			return -1;
		return 0;
	}
	
	

}
