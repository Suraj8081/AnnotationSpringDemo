package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new 
				AnnotationConfigApplicationContext(SportConfig.class);

		Coach coach = context.getBean("tennisCoach", Coach.class);

		System.out.println(coach.getDailyWorkOut());
		
		System.out.println(coach.getDailyFortune());

		context.close();
	}

}
