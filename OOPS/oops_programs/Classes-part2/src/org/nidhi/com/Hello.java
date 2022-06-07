package org.nidhi.com;

public class Hello {


	public static void main(String[] args) {
		Car car = new Car();
		
		car.setSpeed(20);
		System.out.println("Speed: "+car.getSpeed()+"km/hr");
		
		car.setDoors("closed");
		System.out.println("Door is "+ car.getDoors());
		
		car.setEngine("on");
		System.out.println("Engine is "+ car.getEngine());
		
		car.setDriver("seated");
		System.out.println("Driver is "+car.getDriver());
		
		System.out.println("Car is "+ car.run());
	}
}
