package com.bvr.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private EmployeeAddress address;

	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
}
