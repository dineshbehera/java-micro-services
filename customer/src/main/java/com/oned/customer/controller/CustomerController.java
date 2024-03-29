package com.oned.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
    


  
    @GetMapping({"","/"})
	public String getCustomer(HttpServletRequest request) {
		LOGGER.info(request.getRequestURL() +" is called !");
		return request.getRequestURL() +" is called !";
	}

}
