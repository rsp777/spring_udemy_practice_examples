package com.springtutorial.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Default Bean id
@Component
//@Scope("prototype")
////@Component("myTennisCoach")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
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
	
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println("> Tennis Coach : Inside setFortuneService() method ");
//		fortuneService = theFortuneService;
//	}
	
	/*@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Starting UP.....");
	}
	
	*/@PreDestroy
	public void doMyCleanStuff() {
		System.out.println("Cleaning UP.....");
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
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println("safsdfsdfsdfsdfsd");
//		this.fortuneService = fortuneService;
//	}

}
