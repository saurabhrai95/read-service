package com.bt.readservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class ReadServiceConfiguration {

	
	@Bean
	public Docket readApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).build()
				.apiInfo(metaData());
	}
	
	public ApiInfo metaData() {
		return new ApiInfo("Read Service", "Read customer info", "1.0", null, new Contact("THBS", null, "xyz@bt.com"), null, null);
		
		
	}
	
}
