package com.ray.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigFileDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringConfigurationOrAnyName.class);
		
		// get bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
