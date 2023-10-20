package com.pojo;

public class Booking {
	int booking_id;
	int person_id;
	int city_id;
	int state_id;
	int center_id;
	int slot_id;
	public Booking() {
		
	}
	public Booking(int booking_id, int person_id, int city_id, int state_id, int center_id, int slot_id) {
		super();
		this.booking_id = booking_id;
		this.person_id = person_id;
		this.city_id = city_id;
		this.state_id = state_id;
		this.center_id = center_id;
		this.slot_id = slot_id;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public int getState_id() {
		return state_id;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	public int getCenter_id() {
		return center_id;
	}
	public void setCenter_id(int center_id) {
		this.center_id = center_id;
	}
	public int getSlot_id() {
		return slot_id;
	}
	public void setSlot_id(int slot_id) {
		this.slot_id = slot_id;
	}
	
	


}
