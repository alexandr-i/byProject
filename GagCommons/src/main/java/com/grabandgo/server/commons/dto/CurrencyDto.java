/**
 * 
 */
package com.grabandgo.server.commons.dto;

/**
 * @author Alexandr_I
 *
 */
public class CurrencyDto {

	private String symbol;
	private String isoName;
	private Integer isoCode;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getIsoName() {
		return isoName;
	}

	public void setIsoName(String isoName) {
		this.isoName = isoName;
	}

	public Integer getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(Integer isoCode) {
		this.isoCode = isoCode;
	}

}
