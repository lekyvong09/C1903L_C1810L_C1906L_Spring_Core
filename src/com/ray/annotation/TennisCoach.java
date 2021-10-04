package com.ray.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach{

//	@Autowired
//	@Qualifier("badFortuneService")
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("badFortuneService")FortuneService fortuneService) {
		System.out.println("Inside constructor");
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
	
	
	@PostConstruct
	public void doWhenStartingUp() {
		System.out.println("BaseballCoach: preparing to startup");
	}
	
	
	@PreDestroy
	public void doWhenDestroy() {
		System.out.println("BaseballCoach: destroying my things");
	}
}
