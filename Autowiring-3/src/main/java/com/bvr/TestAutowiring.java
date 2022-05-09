package com.bvr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.bvr.config.AppConfig;
import com.bvr.domain.Application;
import com.bvr.domain.Bond;
import com.bvr.domain.Driver;
import com.bvr.domain.Employee;
import com.bvr.domain.Performer;

public class TestAutowiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//ByName Autowiring 
		Application application = (Application) context.getBean("application");
		System.out.println("Application Details : " + application);
		
		
		//ByType Autowiring 
		Employee employee = (Employee) context.getBean("employee");
		System.out.println("Employee Details : " + employee);
		
		
	    //ByConstructor Autowiring 
		Performer performer = (Performer) context.getBean("performer");
		System.out.println("Performer Details : " + performer);
		
		//BySetter Autowiring 
		Driver driver = (Driver) context.getBean("driver");
		System.out.println("Driver Details : " + driver);
		
		Bond bond = (Bond) context.getBean("bond");
		bond.showCar();
		
	}

}
