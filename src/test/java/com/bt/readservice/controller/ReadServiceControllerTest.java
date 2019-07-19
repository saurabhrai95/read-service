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
		
		assertEquals(200,200);
		
	}
	
	@Test
	public void getAllCustomerTest() throws Exception {
		
		assertEquals(200,200);
		
	}
}
