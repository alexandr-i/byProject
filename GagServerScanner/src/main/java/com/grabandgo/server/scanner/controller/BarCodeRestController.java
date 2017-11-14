package com.grabandgo.server.scanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grabandgo.server.commons.dto.ProductDetailsDto;
import com.grabandgo.server.scanner.dto.BarCodeRequestDto;
import com.grabandgo.server.scanner.service.barcode.BarCodeService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/barcode")
@Api(value="onlinestore", description="Operations Comments")
public class BarCodeRestController {

	@Autowired
	@Qualifier("testStabBarCodeService")
	private BarCodeService barCodeService;

	
	@RequestMapping(path = "/{barCode}/{userId}", method = RequestMethod.GET)
	public ResponseEntity<ProductDetailsDto> getProductDetails(@PathVariable String barCode, @PathVariable int userId) {
		BarCodeRequestDto req = new BarCodeRequestDto(barCode , userId);
		return new ResponseEntity<ProductDetailsDto>(barCodeService.getProductDetailsByBarCode(req), HttpStatus.OK);
	}

}
