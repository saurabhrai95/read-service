package com.bt.readservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bt.readservice.entity.Customer;

@Repository
public interface ReadServiceRepository extends MongoRepository<Customer, String> {

	
	public Customer findByName(String name);
}
