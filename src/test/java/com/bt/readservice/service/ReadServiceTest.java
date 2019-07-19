package com.bt.readservice.service;

import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.bt.readservice.entity.Customer;
import com.bt.readservice.repository.ReadServiceRepository;
import com.bt.readservice.service.ReadService;

@RunWith(SpringJUnit4ClassRunner.class)

public class ReadServiceTest {


	@Mock
	private ReadServiceRepository repo;
	
	@InjectMocks
	private ReadService service;
	
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void getCustomerByNameTest() {
		
		assertEquals(1234567893, 1234567893);
		
	}
	
	
	@Test
	public void getAllCustomerTest() {
		
		List<Customer> customerList = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setName("saurabh");
		customer.setPhone(123456789);
		customer.setEmail("saurabh.3.rai@bt.com");
		
		Customer customer1 = new Customer();
		
		customer1.setName("apurv");
		customer1.setPhone(123456789);
		customer1.setEmail("apurv@bt.com");
		
		customerList.add(customer);
		customerList.add(customer1);
		
		Mockito.when(repo.findAll()).thenReturn(customerList);
		
		
		List<Customer> response = service.getAllCustomer();
		
		
		assertEquals(23, response.size());
		
	}
}
