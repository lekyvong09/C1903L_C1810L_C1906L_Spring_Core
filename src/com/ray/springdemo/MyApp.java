package com.ray.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		HappyForturnService myFortuneService = new HappyForturnService();
		
		Coach theCoach = new BaseballCoach(myFortuneService);
		
		System.out.println(theCoach.getDailyFortune());

	}

}
