package com.grabandgo.server.scanner.dto;

import com.grabandgo.server.commons.dto.AbstractDto;

/**
 * @author Alexandr_I
 *
 */
public class BarCodeRequestDto extends AbstractDto {

	private String barCode;
	private Integer userId;

	/**
	 * @param barCode2
	 * @param userId2
	 */
	public BarCodeRequestDto(String barCode, int userId) {
		this.barCode = barCode;
		this.userId = userId;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
