package com.oned.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/product")
public class ProductController {
    Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    
    @GetMapping({"","/"})
	public String getProduct(HttpServletRequest request) {
		LOGGER.info(request.getRequestURL() +" is called !");
		return request.getRequestURL() +" is called !";
	}

}
