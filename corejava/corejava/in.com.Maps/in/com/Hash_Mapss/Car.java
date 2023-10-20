package in.com.Hash_Mapss;

public class Car {
	String cname;
	int cprize;
	String ctype;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCprize() {
		return cprize;
	}
	public void setCprize(int cprize) {
		this.cprize = cprize;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	@Override
	public String toString() {
		return "Car [cname=" + cname + ", cprize=" + cprize + ", ctype=" + ctype + "]";
	}
	

}
