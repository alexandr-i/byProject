package com.grabandgo.server.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grabandgo.server.commons.dto.ProductDetailsDto;
import com.grabandgo.server.health.service.HealthService;

@RestController
@RequestMapping("/api/health")
public class HeathRestController {

	@Autowired
	private HealthService healthService;

	
	@RequestMapping(path = "/{productId}/{userId}", method = RequestMethod.GET)
	public ResponseEntity<ProductDetailsDto> getHealth(@PathVariable String productId, @PathVariable int userId) {
		return new ResponseEntity<ProductDetailsDto>(healthService.getProductDetails(productId), HttpStatus.OK);
	}

}
