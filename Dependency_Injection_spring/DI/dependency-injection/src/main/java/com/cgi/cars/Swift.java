package com.cgi.cars;

import org.springframework.stereotype.Component;

import com.cgi.interfaces.Car;

@Component
public class Swift implements Car{

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "Hatchback from Suzuki";
	}

}
