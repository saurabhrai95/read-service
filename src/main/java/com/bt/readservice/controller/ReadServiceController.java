package com.bt.readservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bt.readservice.entity.Customer;
import com.bt.readservice.service.ReadService;

@RestController
public class ReadServiceController {

	@Autowired
	private ReadService service;

	@GetMapping("customer/{name}")
	public Customer getCustomerByName(@PathVariable("name") String name) {

		return service.getCustomerByName(name);
	}
	
	@GetMapping("customer")
	public List<Customer> getAllCustomer() {

		return service.getAllCustomer();
	}
}
