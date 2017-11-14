/**
 * 
 */
package com.grabandgo.server.scanner.service.barcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.grabandgo.server.commons.dto.ProductDetailsDto;
import com.grabandgo.server.scanner.dto.BarCodeRequestDto;
import com.grabandgo.server.scanner.dto.external.Ean13ProductDetailsDto;

/**
 * @author Alexandr_I
 *
 */
public class Ean13InfoXmlConsumerBarCodeService implements BarCodeService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public ProductDetailsDto getProductDetailsByBarCode(BarCodeRequestDto barReq) {
		Ean13ProductDetailsDto responce = restTemplate.getForObject("http://www.ean13.info/api.php?code={barCode}&key=xccvg55kh43jjf", Ean13ProductDetailsDto.class, barReq.getBarCode());
		return convertEan13InfoToProductDetails(responce);
	}

	public static ProductDetailsDto convertEan13InfoToProductDetails(Ean13ProductDetailsDto product) {
		ProductDetailsDto theResult = new ProductDetailsDto();
		theResult.setName(product.getName());
		theResult.setDescription(product.getDesc());
		//TODO add all fields
		return theResult;
	}
}
