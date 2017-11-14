/**
 * 
 */
package com.grabandgo.server.commons.dto;

import java.math.BigDecimal;

/**
 * @author Alexandr_I
 *
 */
public class ProductDetailsDto extends AbstractDto {
	private String name;
	private BigDecimal price;
	private String description;
	private String pictureURL;
	private String barCode;
	private CurrencyDto currency;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public CurrencyDto getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyDto currency) {
		this.currency = currency;
	}
}
