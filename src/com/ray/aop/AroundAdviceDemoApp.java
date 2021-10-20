package com.ray.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ray.aop.service.TrafficFortuneService;

public class AroundAdviceDemoApp {

	public static void main(String[] args) {
		// read spring configuration class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		TrafficFortuneService theTrafficFortuneService = 
				context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		System.out.println("\nCalling getTrafficFortuneService");
		
		System.out.println("\nMy fortune is: " + theTrafficFortuneService.getFortune());
		
		System.out.println("\nFinish");
		
		context.close();
	}

}
