package com.cg.college;

public class student {
	private String name; 
	private int id;



	public student(String name, int id) {
		
		this.name = name;
		this.id = id;
	}



	void display() {
		System.out.println(" student:" +name);
			System.out.println("student id:" +id);
	}
}