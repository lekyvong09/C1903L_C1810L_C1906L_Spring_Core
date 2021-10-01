package com.ray.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// get bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach secondCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == secondCoach);
		
		System.out.println(result);
		
		System.out.println(theCoach);
		System.out.println(secondCoach);
		
		context.close();

	}

}
