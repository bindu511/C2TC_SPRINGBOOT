package com.cg.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c =new ClassPathXmlApplicationContext("beans.xml");
		
		Human h1 =c.getBean("human",Human.class);
		h1.startPumping();

	}

}
