package com.springtutorial.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Default Bean id
@Component

////@Component("myTennisCoach")
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	//define default constructor
	public TennisCoach() {
		System.out.println("> Tennis Coach : Inside default constructor ");
	}
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		// TODO Auto-generated constructor stub
	}*/
	
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("> Tennis Coach : Inside setFortuneService() method ");
		fortuneService = theFortuneService;
	}


	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley.";
	}

	@Override
	public String getFitness() {
		// TODO Auto-generated method stub
		return "Tennis Player are so fit . ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
