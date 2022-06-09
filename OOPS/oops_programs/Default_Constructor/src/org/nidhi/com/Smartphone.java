package org.nidhi.com;

public class Smartphone {

	//no constructor
	
	//default constructor
	public Smartphone() {
		//if there is no constructor by default java will inject constructor like this
		
	}
	
	
	public Smartphone(String brand) {
		//parameterized constructor and now constructor in main method will give error
		//so if there is parameterized constructor instead of default JAVA will not inject default constructor but will try to inject parameterized constructor
		this.brand = brand;
	}
	private String brand = "Apple";

	public String getBrand() {
		return brand;
	}
	
}
