package com.ray.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		HappyForturnService myFortuneService = new HappyForturnService();
		
		TennisCoach theCoach = new TennisCoach();
		theCoach.setFortuneService(myFortuneService); 
		
		System.out.println(theCoach.getDailyFortune());

	}

}
