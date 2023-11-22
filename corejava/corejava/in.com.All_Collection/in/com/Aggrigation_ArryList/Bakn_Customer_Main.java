package in.com.Aggrigation_ArryList;

import java.util.ArrayList;
import java.util.Iterator;

import in.com.corejavaCello_Cloning.Bankes;

public class Bakn_Customer_Main {
	ArrayList<Banks>al=new ArrayList<Banks>();
	public void CheakSameBank(ArrayList<Banks>al) {
		Iterator<Banks>it=al.iterator();
		while(it.hasNext()) {
			Banks ba=it.next();
			if(ba.name.equals("sbi")) {
				System.out.println(ba.location+" "+ba.C.cid+" "+ba.C.name+" "+ba.C.location+" "+ba.C.number);
			}
		}
	}
	public void CheakCityCustomer(ArrayList<Banks>al) {
		Iterator<Banks>it=al.iterator();
		while(it.hasNext()) {
			Banks bans=it.next();
			if(bans.C.location.equals("pune")) {
				System.out.println(bans.C.cid+" "+bans.C.name+" "+bans.C.number+" "+bans.name+" "+bans.location);
			}
		}
	}

	public static void main(String[] args) {
		Bakn_Customer_Main bank=new Bakn_Customer_Main();
		Customer c1=new Customer(101, "Sham", "pune", 5465464);
		Customer c2=new Customer(99, "rahul", "indore", 8845464);
		Customer c3=new Customer(111, "dev", "pune", 21265464);
		Customer c4=new Customer(131, "ram", "mumbai", 63265464);
		
		Banks b =new Banks("sbi", "indore", c1);
		Banks b1 =new Banks("boi", "delhi", c2);
		Banks b2 =new Banks("sbi", "noida", c3);
		Banks b3 =new Banks("hdfc", "indore", c4);
		ArrayList<Banks>al=new ArrayList<Banks>();
		al.add(b);al.add(b1);al.add(b2);al.add(b3);
		System.out.println("cheak sbi in this city...");
		bank.CheakSameBank(al);
		System.out.println("==================");
		System.out.println("cheak pune city bank and customer....");
		bank.CheakCityCustomer(al);
		
		
		

	}

}
