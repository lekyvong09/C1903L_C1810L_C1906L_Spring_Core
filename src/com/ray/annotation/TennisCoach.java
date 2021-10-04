package com.ray.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

//	@Autowired
//	@Qualifier("badFortuneService")
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("badFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
//	
//	@Autowired
//	public void normalMethod(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Jumping around";
	}
	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
