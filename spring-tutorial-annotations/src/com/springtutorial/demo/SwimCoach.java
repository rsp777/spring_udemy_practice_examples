package com.springtutorial.demo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
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
