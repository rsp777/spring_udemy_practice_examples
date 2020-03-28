package com.springtutorial;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String emailAddress;
	private  String team;

	public CricketCoach() {
		System.out.println("Inside no-arg CricketCoach constructor!");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setFortuneService setter method!");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setEmailAddress setter method!");
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		System.out.println("Inside setTeam setter method!");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
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
