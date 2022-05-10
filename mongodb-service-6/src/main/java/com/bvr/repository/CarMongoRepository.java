package com.bvr.repository;

import org.springframework.data.repository.CrudRepository;

import com.bvr.model.Car;

public interface CarMongoRepository extends CrudRepository<Car, String> {

}
