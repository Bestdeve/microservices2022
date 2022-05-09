package com.bvr.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("performer")
public class Performer {

	public Performer() {
		// TODO Auto-generated constructor stub
	}
	
	private Instrument instrument ;

	@Autowired
	public Performer(Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Performer [instrument=" + instrument + "]";
	}
	
	

}
