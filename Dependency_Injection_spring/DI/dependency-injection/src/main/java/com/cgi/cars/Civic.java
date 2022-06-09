package com.cgi.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cgi.interfaces.Car;
@Component("myCivic")
public class Civic implements Car {

	@Autowired
	Engine engine = new Engine();
	
	@Override
	public String specs() {
		String specs = "Sedan from Honda with engine as "+engine.getType();
		// TODO Auto-generated method stub
		return specs;
	}

}
