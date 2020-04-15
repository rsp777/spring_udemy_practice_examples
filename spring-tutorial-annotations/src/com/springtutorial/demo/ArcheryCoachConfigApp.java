package com.springtutorial.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArcheryCoachConfigApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SportsConfig.class);
		
		ArcheryCoach theCoach = context.getBean("archeryCoach",ArcheryCoach.class);
		System.out.println(theCoach.getDailyworkout());
		context.close();
		
		
	}

}
