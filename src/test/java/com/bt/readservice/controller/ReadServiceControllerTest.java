package com.bt.readservice.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.BDDMockito.given;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.ArrayList;
import java.util.List;

import com.bt.readservice.entity.Customer;
import com.bt.readservice.service.ReadService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(controllers=ReadServiceController.class)
public class ReadServiceControllerTest {

	@MockBean
	private ReadService service;
	
	@Autowired
	private MockMvc mvc;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void getCustomerByNameTest() throws Exception {
		
		Customer customer = new Customer();
		customer.setId("5d23236c29e73030e02e35cc");
		customer.setName("saurabh");
		customer.setPhone(123456789);
		customer.setEmail("saurabh.3.rai@bt.com");
		
		given(service.getCustomerByName(ArgumentMatchers.anyString())).willReturn(customer);
		
		MockHttpServletResponse res= mvc.perform(get("/customer/xyz")).andReturn().getResponse();
		
		assertEquals(200,res.getStatus());
		
		
	}
	
	@Test
	public void getAllCustomerTest() throws Exception {
		
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
		
		given(service.getAllCustomer()).willReturn(customerList);
		
		MockHttpServletResponse res= mvc.perform(get("/customer")).andReturn().getResponse();
		
		assertTrue(res.getContentAsString().contains("saurabh"));
		assertTrue(res.getContentAsString().contains("apurv"));
		
	}
}
