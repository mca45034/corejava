package Aggrigation;

public class Company {
 String cname;
 String location;
 Employe e;
public Company(String cname, String location, Employe e) {
	super();
	this.cname = cname;
	this.location = location;
	this.e = e;
}
@Override
public String toString() {
	return "Company [cname=" + cname + ", location=" + location + "]";
}
 
}
