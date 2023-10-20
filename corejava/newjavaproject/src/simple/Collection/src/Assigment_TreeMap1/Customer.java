package Assigment_TreeMap1;

public class Customer implements Comparable<Customer>{
	int cusId;
	String cusName;
	String Mobile_filed;
	public Customer(int cusId, String cusName, String mobile_filed) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		Mobile_filed = mobile_filed;
	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", Mobile_filed=" + Mobile_filed + "]";
	}
	@Override
	public int compareTo(Customer o) {
		if(this.cusId>o.cusId)
			return 1;
		else if(this.cusId<o.cusId)
			return -1;
		return 0;
	}
	

}
