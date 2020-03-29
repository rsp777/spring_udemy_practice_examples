package com.springtutorial;

public class HappyFortuneService implements FortuneService{

	
	@Override
	public String getFortune() {
		return "Today is your lucky day!";

	}

	@Override
	public String getFortunes(int i) {
		String[] fortunes = 
			{"Today is your lucky day!","You will win the WorldCup","Bad Luck","You will meet"
					+ "your favourite person."};
		
			System.out.println("sdfds :"+i);
			
			return fortunes[i];
		}
		
	}


