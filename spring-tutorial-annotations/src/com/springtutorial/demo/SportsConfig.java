package com.springtutorial.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springtutorial.demo")
public class SportsConfig {
	
	//define bean for lucky fortune service
	@Bean
	public FortuneService luckyFortuneService() {//method name is actually the bean id
		return new LuckyFortuneService();
	}
	
	//define bean for our swim Coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(luckyFortuneService());
	}
	
	//
}
