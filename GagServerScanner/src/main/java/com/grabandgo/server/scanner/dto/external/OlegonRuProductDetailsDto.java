/**
 * 
 */
package com.grabandgo.server.scanner.dto.external;

import java.util.List;

import com.grabandgo.server.commons.dto.AbstractDto;

/**
 * @author Alexandr_I
 *
 */
public class OlegonRuProductDetailsDto extends AbstractDto {

	private Integer status;
	private List<String> names;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

}
