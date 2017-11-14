/**
 * 
 */
package com.grabandgo.server.fwk.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;;

/**
 * @author Alexandr_I
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such Product") // 404
public class ProductNotFoundException extends CommonGagRuntimeException {

	private static final long serialVersionUID = 286030879612231933L;

	public ProductNotFoundException(String message) {
		super(message);
	}
}
