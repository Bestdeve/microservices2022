package com.bvr.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bond {

	public Bond() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	@Qualifier("Mustang")
	private Car car;
	
	public void showCar() {
		car.getCarName();
	}

}
