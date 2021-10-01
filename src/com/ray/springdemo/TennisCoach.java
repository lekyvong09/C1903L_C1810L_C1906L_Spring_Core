package com.ray.springdemo;

public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoach() {
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Jump 2 around the yard";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
