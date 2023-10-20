package OOps;

public class Parlar {
	String P_name;
	String P_address;
	int P_Mob;
	Customer r;
	private String P_adress;
	public void SetP_name(String P_name) {
		this.P_name=P_name;
	}
	public String getP_name() {
		return P_name;
	}
	public void SetP_address(String P_adress) {
		this.P_adress=P_adress;
	}
	public String getP_adress() {
		return P_adress;
	}
	public void  SetP_Mob(int P_Mob) {
		this.P_Mob=P_Mob;
	}
	public int getP_Mob() {
		return P_Mob;
	}
	public void Setr(Customer r) {
		this.r=r;
	}
	public Customer Setr() {
		return r;
	}

}
