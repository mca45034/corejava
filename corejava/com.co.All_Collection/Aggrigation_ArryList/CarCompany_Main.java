package Aggrigation_ArryList;

import java.util.ArrayList;
import java.util.Iterator;

public class CarCompany_Main {
	ArrayList<Car_Company>al=new ArrayList<>();
	void cheakCity(ArrayList<Car_Company>al) {
		Iterator<Car_Company>it=al.iterator();
		while(it.hasNext()) {
			Car_Company cw=it.next();
			if(cw.Caddress.equalsIgnoreCase("bhopal")) {
				System.out.println(cw.Cname+" "+cw.c.price);
			}
		}
	}
	void cheakFual(ArrayList<Car_Company>al) {
		Iterator<Car_Company>it=al.iterator();
		while(it.hasNext()) {
			Car_Company cm=it.next();
			if(cm.c.type.equalsIgnoreCase("diesal")) {
				System.out.println(cm.Cname+" "+cm.Caddress+" "+cm.c.price);
			}
		}
	}

	public static void main(String[] args) {
		CarCompany_Main cm=new CarCompany_Main();
		ArrayList<Car_Company>al=new ArrayList<>();
		Car c=new Car("diesal", 850000);
		Car c1=new Car("petrole",120000);
		Car c2=new Car("petrole", 1300000);
		Car c3=new Car("cng", 115000);
		Car c4=new Car("electric", 1570000);
		Car_Company cc=new Car_Company("Hundai", "Indore", c);
		Car_Company cc1=new Car_Company("kia", "bhopal", c1);
		Car_Company cc2=new Car_Company("tata", "bhopal", c2);
		Car_Company cc3=new Car_Company("i20", "indore", c3);
		Car_Company cc4=new Car_Company("tata", "pune", c4);
		al.add(cc);
		al.add(cc1);
		al.add(cc2);
		al.add(cc3);
		al.add(cc4);
		cm.cheakCity(al);
		System.out.println("------------------");
		System.out.println("search petrol car");
		cm.cheakFual(al);
		
		
		

	}

}
