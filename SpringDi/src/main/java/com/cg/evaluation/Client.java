package com.cg.evaluation;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Student s2 = c.getBean("s2",Student.class);
		s2.cheating();
		
		AnotherStudent s3 = c.getBean("s3",AnotherStudent.class);
		s3.startCheating();

	}

}
