package com.springtutorial;

public class TrackCoach implements Coach {

	//define a private field for dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {}
	//define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : inside method doStartupStuff");
	}
	
	public void doMyCleanStuff() {
		System.out.println("TrackCoach : inside method doMyCleanStuff");
	}

}
