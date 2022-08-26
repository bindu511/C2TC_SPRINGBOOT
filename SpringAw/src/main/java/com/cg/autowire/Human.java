package com.cg.autowire;

public class Human {
	private Heart heart;

	public Human(Heart heart) {
		super();
		this.heart=heart;
	}
	
	
	public void startPumping() {
		heart.pumping();
	}

	
		 
	}

