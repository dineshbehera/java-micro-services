package com.oned.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
	
    Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @GetMapping({"", "/"})
	public String home(HttpServletRequest request) {
		LOGGER.info(request.getRequestURL() +" is called !");
		return request.getRequestURL() +" is called !";
	}
    


}
