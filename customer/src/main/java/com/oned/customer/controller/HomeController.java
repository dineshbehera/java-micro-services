package com.oned.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
    Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
	public String home() {
		LOGGER.info("request received GET home()");
		return "Customer service is running !";
	}
	

}
