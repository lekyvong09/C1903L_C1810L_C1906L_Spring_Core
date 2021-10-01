package com.ray.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyForturnService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}
}
