/**
 * 
 */
package com.grabandgo.server.advert.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Alexandr_I
 *
 */
@Entity
public class Currency {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String symbol;
	private String isoName;
	private Integer isoCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
