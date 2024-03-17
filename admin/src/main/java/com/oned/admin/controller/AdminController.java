package com.oned.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/admin")
public class AdminController {
    Logger LOGGER = LoggerFactory.getLogger(AdminController.class);

  
    @GetMapping({"","/"})
	public String getAdmin(HttpServletRequest request) {
		LOGGER.info(request.getRequestURL() +" is called !");
		return request.getRequestURL() +" is called !";
	}

}
