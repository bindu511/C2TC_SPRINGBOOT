package com.cg.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mobile {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		
		Sim s = (Sim)c.getBean(Sim.class);
		s.calling();
		s.data();
		/*
		 * vodafone v = (vodafone)c.getBean("vodafone",vodafone.class); v.calling();
		 * v.data();
		 * 
		 * jio j = (jio)c.getBean("jio",jio.class); j.calling(); j.data();
		 */
	}
	

}
