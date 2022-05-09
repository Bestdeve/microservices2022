package com.bvr.domain;

import org.springframework.stereotype.Component;

@Component
public class EmployeeAddress {

	public EmployeeAddress() {
		// TODO Auto-generated constructor stub
	}
	
	private String street = "KR Puram";
	private String city = "Bangalore";
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [street=" + street + ", city=" + city + "]";
	}

	
}
