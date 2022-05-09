package com.bvr.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.bvr.domain.HelloWorld;
import com.bvr.domain.HelloWorldImpl;

@Configuration
public class HelloWorldConfig {

	@Bean(name="helloWorldBean")
	@Description("This is a sample Bean used in leagcy style")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}
}
