package com.springtutorial.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the container
		Coach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		Coach alphaCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		
		//print out the results
		System.out.println("Pointing to the same object : "+result);
		System.out.println("Memory location of theCoach : "+theCoach);
		System.out.println("Memory location of alphaCoach : "+alphaCoach);
		
		//close the context
		context.close();
	}

}
