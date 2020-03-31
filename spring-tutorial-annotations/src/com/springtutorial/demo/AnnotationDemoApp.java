package com.springtutorial.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get Bean from the spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
//		Coach theCoach = context.getBean("myTennisCoach",Coach.class);
		Coach myCoach = context.getBean("volleyBallCoach",Coach.class);
		
		//Call a method on the bean
		System.out.println(theCoach.getDailyworkout());
		System.out.println(theCoach.getFitness());
		System.out.println(myCoach.getDailyworkout());
		System.out.println(myCoach.getFitness());
		
		//Close the context
		context.close();
	}

}
