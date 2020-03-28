package com.springtutorial;

public class BaseballCoach implements Coach{

	//define a private  field for the dependency
	private FortuneService fortuneService;

	//define a constructor for dependency injection
	public BaseballCoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes for batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortune service to get a fortune. 
		return fortuneService.getFortune();//helping out a coach by this helper class
	}
}
