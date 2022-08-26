package com.cg.autowire;

public class Heart {
	private String animalname;
	private int numberofheart;
	
	
	public String getAnimalname() {
		return animalname;
	}
	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}
	public int getNumberofheart() {
		return numberofheart;
	}
	public void setNumberofheart(int numberofheart) {
		this.numberofheart = numberofheart;
	}
	public void pumping() {
		System.out.println("animal name is:" +animalname);
		System.out.println("number of heart is:" +numberofheart);
		System.out.println("blood is pumping high");
	}
	Heart(){
		System.out.println("ur serious");
	}
}
