package com.ray.annotation;

public class SwimCoach implements Coach{

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "swim 2 km";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
