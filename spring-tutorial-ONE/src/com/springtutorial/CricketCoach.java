package com.springtutorial;

import java.util.Random;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String emailAddress;
	private  String team;
	private int index ;
	//	public Random random;
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

	public void setIndex(int index) {
		if(index < 4) {
			this.index = index;
			System.out.println("Inside setIndex...");
			System.out.println(index);
		}
	}

	public int getIndex() {
		System.out.println("Inside getIndex..."+index);
		return index;
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
	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int i = random.nextInt(10);
		System.out.println("Inside getDaily");
		setIndex(i);
		System.out.println("Inside getDailyFortune..."+getIndex());
		return fortuneService.getFortunes(getIndex());
	}

}
