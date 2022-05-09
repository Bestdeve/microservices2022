package com.bvr.domain;

import org.springframework.stereotype.Component;

@Component("Ferari")
public class Ferari implements Car {


	@Override
	public void getCarName() {
		// TODO Auto-generated method stub
		System.out.println("This is Ferari");
	}

}
