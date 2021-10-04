package com.ray.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		// get bean
		Coach the1stCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach the2ndCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (the1stCoach == the2ndCoach);
		
		System.out.println(result);
		System.out.println("\nMemory location for the1stCoach" + the1stCoach);
		System.out.println("\nMemory location for the2ndCoach" + the2ndCoach);
		
		context.close();
	}

}
