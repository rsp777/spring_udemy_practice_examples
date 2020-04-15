package com.springtutorial.demo;

import org.springframework.context.annotation.Configuration;


public class ArcheryCoach implements Coach {

	private FortuneService fortuneService;
	public ArcheryCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Shoot 100 arrows daily";
	}

	@Override
	public String getFitness() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
