package com.rodrigo.soukef.microservice.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.soukef.microservice.domain.Car;

@Repository
public interface CarRegisterCrud extends CrudRepository<Car, Long> {

public Car findOneByLicensePlate(String licensePlate);

}
