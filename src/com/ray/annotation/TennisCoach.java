package com.ray.annotation;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Jumping around";
	}
	

}
