package com.bvr.domain;

import org.springframework.stereotype.Component;

@Component
public class License {

	public License() {
		// TODO Auto-generated constructor stub
	}
	
	private String number = "1234567c";

	@Override
	public String toString() {
		return "License [number=" + number + "]";
	}
	
	

}
