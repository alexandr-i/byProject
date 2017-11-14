/**
 * 
 */
package com.grabandgo.server.commons.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Alexandr_I
 *
 */
public abstract class AbstractDto {

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
