package com.cgi.com;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> demo = new Stack<>();
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		demo.pop();
		
		if(demo.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
		}
		
		for(int temp: demo) {
			System.out.println(temp);
		}
		
		System.out.println("Top Element : "+demo.peek());
		System.out.println("Searched index if element exist : "+demo.search(3));
		System.out.println("Search Index if element not exists : "+ demo.search(11));
	}

}
