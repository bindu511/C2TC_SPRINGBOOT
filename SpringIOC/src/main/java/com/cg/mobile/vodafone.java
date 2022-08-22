package com.cg.mobile;

public class vodafone implements Sim {
	vodafone(){
		System.out.println("vodafone constructor");
	}
	public void calling() {
		System.out.println("calling from vodafone service");
		
	}
	public void data() {
		System.out.println("calling from jio service");

}
}