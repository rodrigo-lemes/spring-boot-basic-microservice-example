package com.rodrigo.soukef.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
		Car carData = null;

		try {
			carData = (new Gson()).fromJson(newCar, Car.class);
			carRegisterRepository.save(carData);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (new Gson()).toJson(result);
	}

	@RequestMapping(value = "/findAllCars", method = RequestMethod.GET)
	String carSearch() {

		List<Car> locatedCars = null;

		try {
			locatedCars = (List<Car>) carRegisterRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new Gson().toJson(locatedCars);
	}

	@RequestMapping(value = "/findCarByPlate", consumes = "application/json")
	public String findCarByPlate(@RequestBody String licensePlate) {

		String result;

		Car carData = new Car();
		carData = new Gson().fromJson(licensePlate, carData.getClass());
		try {
			carData = carRegisterRepository.findOneByLicensePlate(carData.getLicensePlate());
			result = new Gson().toJson(carData);
		} catch (Exception e) {
			result = "Veículo não localizado";
		}

		return result;
	}

	@RequestMapping(value = "/uploadFile", method=RequestMethod.POST)
	public void uploadFile(@RequestParam("file") MultipartFile file ) {
		
		file = null;

	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CarRegistrationMicroServiceController.class, args);
	}

}
