/**
 * 
 */
package com.grabandgo.server.scanner.service.barcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.grabandgo.server.commons.dto.ProductDetailsDto;
import com.grabandgo.server.fwk.exception.ProductNotFoundException;
import com.grabandgo.server.scanner.dto.BarCodeRequestDto;
import com.grabandgo.server.scanner.dto.external.OlegonRuProductDetailsDto;
import com.grabandgo.server.scanner.utils.PicturesUtils;

/**
 * @author Alexandr_I
 *
 */
@Service
public class OlegonRuRestConsumerBarCodeService implements BarCodeService {

	private static final Logger LOG = LoggerFactory.getLogger(OlegonRuRestConsumerBarCodeService.class);

	@Autowired
	private RestTemplate restTemplate;
	
	public ProductDetailsDto getProductDetailsByBarCode(BarCodeRequestDto barReq) {
		ResponseEntity<OlegonRuProductDetailsDto> result = restTemplate.getForEntity("https://barcodes.olegon.ru/api/card/name/{BarCode}", OlegonRuProductDetailsDto.class, barReq.getBarCode());
		LOG.debug("Result = {}", result.getBody());
		return convertOlegonRuToProductDetails(result.getBody());
	}

	public static ProductDetailsDto convertOlegonRuToProductDetails(OlegonRuProductDetailsDto product) {
		ProductDetailsDto theResult = new ProductDetailsDto();
		if (product.getStatus() == HttpStatus.OK.value()) {
			theResult.setName(product.getNames().get(0));
			theResult.setPictureURL(PicturesUtils.getRandomPicture());
		} else {
			throw new ProductNotFoundException("");
		}
		//TODO add all fields
		return theResult;
	}

	
}
