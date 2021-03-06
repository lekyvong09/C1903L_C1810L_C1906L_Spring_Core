package com.ray.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 2km";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void doWhenStartingUp() {
		System.out.println("BaseballCoach: preparing to startup");
	}
	
	public void doWhenDestroy() {
		System.out.println("BaseballCoach: destroying my things");
	}

}
