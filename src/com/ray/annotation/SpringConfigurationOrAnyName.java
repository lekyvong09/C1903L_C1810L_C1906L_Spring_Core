package com.ray.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.ray.annotation")
public class SpringConfigurationOrAnyName {

	@Bean
	public FortuneService badFortuneService() {
		return new BadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(badFortuneService());
	}
}
