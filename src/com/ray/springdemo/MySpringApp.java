package com.ray.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		// load Spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean
		Coach theCoach = context.getBean("myTennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
