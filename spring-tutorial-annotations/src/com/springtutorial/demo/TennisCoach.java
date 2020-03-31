package com.springtutorial.demo;

import org.springframework.stereotype.Component;

//Default Bean id
@Component

//@Component("myTennisCoach")
public class TennisCoach implements Coach {

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

}
