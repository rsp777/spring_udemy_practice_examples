package com.springtutorial;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	

	public CricketCoach() {
		System.out.println("Inside no-arg CricketCoach constructor!");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setFortuneService setter method!");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily do bowling practice for 2 hrs.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
