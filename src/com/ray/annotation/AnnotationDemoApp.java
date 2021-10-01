package com.ray.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		// get bean
		Coach theCoach = context.getBean("myTennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
