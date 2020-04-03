package com.springtutorial.demo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${email}")
	private String email;
	
	@Value("${team}")
	private String team;
	
	public SwimCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyworkout() {
		return "Swim 1000 meters as a warm-up";
	}

	@Override
	public String getFitness() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
			return fortuneService.getFortune();
	}

}
