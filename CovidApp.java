package com.amdocs.training.entity;

import org.springframework.stereotype.Component;

@Component
public class CovidApp {

	private int id;
	private String city;
	private int pincode;
	
	public CovidApp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CovidApp(int id, String city, int pincode) {
		super();
		this.id = id;
		this.city = city;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "CovidApp [id=" + id + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
