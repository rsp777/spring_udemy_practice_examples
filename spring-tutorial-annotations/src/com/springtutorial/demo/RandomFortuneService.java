package com.springtutorial.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

	// create a array of strings
	public String[] data = {"Beware of the wolf in sheep's clothing",
						    "Diligence is the mother of good luck",
						    "The journey is the reward"};
	
	//Create a random number generator
	private Random random = new Random();
	
	
	@Override
	public String getFortune() {
		// Pick a random String from the array
		int index = random.nextInt(data.length);// gives random number
		String theFortune = data[index];
		return theFortune;
	}

}
