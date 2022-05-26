package com.cgi.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("Canada");
		countries.add("USA");
		countries.add("Russia");
		
		new App().printList(countries);
		countries.add(1, "America");
		new App().printList(countries);
		countries.set(2, "Brazil");
		new App().printList(countries);
		
		List<String> demo = new ArrayList<>();
		demo.add("One");
		demo.add("Two");
		demo.add("Three");
		demo.add("Four");
		demo.add("Five");
		new App().displayList(demo);
	} 
	
	void printList(LinkedList<String> list) {
		for(String element: list) {
			System.out.println("Element: "+element);
		}
		System.out.println("*****************************");
	}
	
	//Implementation of List Interface
	//List interface can handle all types of list but it should be type of string 
	void displayList(List<String> list) {
		for(String element: list) {
			System.out.println("Element: "+ element);
		}
		System.out.println("*****************************");
	}

}
