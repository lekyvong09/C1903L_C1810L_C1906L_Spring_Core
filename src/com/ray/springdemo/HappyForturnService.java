package com.ray.springdemo;

public class HappyForturnService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}
}
