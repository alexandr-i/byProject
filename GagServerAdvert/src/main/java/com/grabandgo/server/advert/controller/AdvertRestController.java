package com.grabandgo.server.advert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grabandgo.server.advert.dto.AdvertDto;
import com.grabandgo.server.advert.service.AdvertService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/advert")
@Api(value="onlinestore", description="Operations Comments")
public class AdvertRestController {

	@Autowired
//	@Qualifier("testStabBarCodeService")
	private AdvertService advertService;

	
	@RequestMapping(path = "/{cartId}/{userId}", method = RequestMethod.GET)
	public ResponseEntity<AdvertDto> getProductDetails(@PathVariable int cartId, @PathVariable int userId) {
		AdvertDto theResult = advertService.getAdvert(cartId, userId);
		return new ResponseEntity<AdvertDto>(theResult, HttpStatus.OK);
	}

}
