/**
 * 
 */
package com.grabandgo.server.scanner.utils;

import com.grabandgo.server.commons.dto.CurrencyDto;
import com.grabandgo.server.commons.dto.ProductDetailsDto;
import com.grabandgo.server.scanner.model.Currency;
import com.grabandgo.server.scanner.model.Product;

/**
 * @author Alexandr_I
 *
 */
public class DtoUtils {

	/**
	 * @param item
	 * @return
	 */
	public static ProductDetailsDto convertProductToDto(Product item) {
		ProductDetailsDto theResult = null;
		if (item != null) {
			theResult = new ProductDetailsDto();
			theResult.setName(item.getName());
			theResult.setDescription(item.getDescription());
			theResult.setPrice(item.getPrice());
			theResult.setBarCode(item.getBarCode());
			theResult.setCurrency(convertCurrencyToDto(item.getCurrency()));
			theResult.setPictureURL(item.getPictureUrl());
		}
		return theResult;
	}

	/**
	 * @param currency
	 * @return
	 */
	private static CurrencyDto convertCurrencyToDto(Currency currency) {
		CurrencyDto theResult = null;
		if (currency != null) {
			theResult = new CurrencyDto();
			theResult.setIsoCode(currency.getIsoCode());
			theResult.setIsoName(currency.getIsoName());
			theResult.setSymbol(currency.getSymbol());
		} 
		return theResult;
	}

}
