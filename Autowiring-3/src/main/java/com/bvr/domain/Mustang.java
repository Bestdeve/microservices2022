package com.bvr.domain;

import org.springframework.stereotype.Component;

@Component("Mustang")
public class Mustang implements Car {


	@Override
	public void getCarName() {
		// TODO Auto-generated method stub
		System.out.println("This is Mustang");
	}

}
