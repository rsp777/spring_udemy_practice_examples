package com.springtutorial.demo;

import org.springframework.stereotype.Component;

@Component
public class VolleyBallCoach implements Coach{

	@Override
	public String getDailyworkout() {
		
		return "Practice with ball daily!";
	}

	@Override
	public String getFitness() {
		// TODO Auto-generated method stub
		return "Volley ball Coach is not fit for players.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
