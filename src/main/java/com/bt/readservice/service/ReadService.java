package com.bt.readservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.readservice.entity.Customer;
import com.bt.readservice.repository.ReadServiceRepository;

@Service
public class ReadService {

	@Autowired
	private ReadServiceRepository readRepo;
	
	
	
	public Customer getCustomerByName(String name) {

	
		return readRepo.findByName(name);
	}
	
	public List<Customer> getAllCustomer() {

		
		return readRepo.findAll();
	}
	
	
	
}
