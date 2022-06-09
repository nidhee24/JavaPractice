package com.cgi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cgi.cars.Civic;
import com.cgi.cars.Swift;
import com.cgi.interfaces.Car;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
		
		Car swift = new Swift();
		Car civic = new Civic();
		
	
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car = context.getBean("myCivic",Car.class);
		System.out.println(car.specs());
		context.close();
	}
}
