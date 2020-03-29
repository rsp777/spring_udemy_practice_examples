package com.springtutorial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach myTrackCoach = context.getBean("myCoach",Coach.class);

		boolean result = (theCoach == myTrackCoach);
		System.out.println("Pointing the same object : "+result);
		
		System.out.println("Address of theCoach : "+theCoach);
		System.out.println("Address of myTrackCoach : "+myTrackCoach);
	}

}
