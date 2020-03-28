package com.springtutorial;
/* Inversion Of Control*/
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theTrackCoach = context.getBean("myTrackCoach", Coach.class);
		//Calling Methods on the bean
		System.out.println("****-----Baseball Coach-----****");
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println();
		System.out.println("****-----Track Coach-----****");
		System.out.println(theTrackCoach.getDailyWorkout());
		System.out.println(theTrackCoach.getDailyFortune());
		//Close the context
		context.close();
	}

}
