package com.bvr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.bvr.configuration.HelloWorldConfig;
import com.bvr.domain.HelloWorld;

public class TestComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
		
		bean.sayHello("Second Bean Component using Legacy Style");
		
		context.close();

	}

}
