package com.pojo;

public class Person_details {
	int person_id;
	String person_name;
	String person_DOB;
	String person_adhar;
	String person_phon;
	String person_address;
	public Person_details() {
		
	}
	public Person_details(int person_id, String person_name, String person_DOB, String person_adhar, String person_phon,
			String person_address) {
		super();
		this.person_id = person_id;
		this.person_name = person_name;
		this.person_DOB = person_DOB;
		this.person_adhar = person_adhar;
		this.person_phon = person_phon;
		this.person_address = person_address;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getPerson_DOB() {
		return person_DOB;
	}
	public void setPerson_DOB(String person_DOB) {
		this.person_DOB = person_DOB;
	}
	public String getPerson_adhar() {
		return person_adhar;
	}
	public void setPerson_adhar(String person_adhar) {
		this.person_adhar = person_adhar;
	}
	public String getPerson_phon() {
		return person_phon;
	}
	public void setPerson_phon(String person_phon) {
		this.person_phon = person_phon;
	}
	public String getPerson_address() {
		return person_address;
	}
	public void setPerson_address(String person_address) {
		this.person_address = person_address;
	}
}
