package org.nidhi.com;

public class Car {
 
	//POJO class
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// In order to access private property getter/setter is used
	
	public String run() {
		if(this.doors.equals("closed") && this.engine.equals("on")
				&& this.driver.equals("seated") && this.speed > 0)
		{
			return "running";
		}
		else {
			return "not running";
		}
	}
	
}
