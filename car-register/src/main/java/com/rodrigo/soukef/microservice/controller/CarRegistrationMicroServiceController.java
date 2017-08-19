package com.rodrigo.soukef.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.rodrigo.soukef.microservice.crud.CarRegisterCrud;
import com.rodrigo.soukef.microservice.domain.Car;

@RestController
@EnableAutoConfiguration
@EnableJpaRepositories("com.rodrigo.soukef.microservice.crud")
@EntityScan("com.rodrigo.soukef.microservice.domain")
public class CarRegistrationMicroServiceController {

	@Autowired
	private CarRegisterCrud carRegisterRepository;

	@RequestMapping(value = "/includeNewCar", method = RequestMethod.POST, consumes = "application/json")
	String includeNewCar(@RequestBody String newCar) {
		Boolean result = false;

		try {
			carRegisterRepository.save((new Gson()).fromJson(newCar, Car.class));
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (new Gson()).toJson(result);
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(CarRegistrationMicroServiceController.class, args);
	}

}
