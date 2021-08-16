package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		Coach coach1 = context.getBean("tennisCoach", Coach.class);

		boolean result=(coach==coach1);
		
		
		System.out.println("Pointin Same Obect="+result);
		
		System.out.println("Momory location of first Object="+coach);
		
		System.out.println("Momory location of first Object="+coach1);

		context.close();

	}

}
