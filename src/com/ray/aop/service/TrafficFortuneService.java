package com.ray.aop.service;

import java.util.concurrent.*;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	public String getFortune() {
		try {
			// delay. sleep 5 seconds
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "Expect heavy traffic";
	}
	
	public String getFortune(boolean isError) { 
		if (isError)
			throw new RuntimeException("Critical error!!!");
		
		return getFortune();
	}
}
