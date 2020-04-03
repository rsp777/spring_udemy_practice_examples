package com.springtutorial.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//Read spring configuration file
		AnnotationConfigApplicationContext 
		context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		//get Bean from the spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
//		Coach theCoach = context.getBean("myTennisCoach",Coach.class);
		Coach myCoach = context.getBean("volleyBallCoach",Coach.class);
		
		//Call a method on the bean
		System.out.println(theCoach.getDailyworkout());
//		System.out.println(theCoach.getFitness());
//		System.out.println(myCoach.getDailyworkout());
//		System.out.println(myCoach.getFitness());
		
		System.out.println(theCoach.getDailyFortune());
//		System.out.println(theCoach.doSome);
		//Close the context
		context.close();
	}

}
