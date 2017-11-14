/**
 * 
 */
package com.grabandgo.server.health.utils;

import com.grabandgo.server.commons.dto.ProductDetailsDto;

/**
 * @author Alexandr_I
 *
 */
public class DtoStabFactory {

	public static ProductDetailsDto getNoSuchProductStub() {
		ProductDetailsDto theResult = new ProductDetailsDto();
		theResult.setName("No Such Product");
		return theResult;
	}
}
