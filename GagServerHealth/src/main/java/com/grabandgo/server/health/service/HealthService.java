/**
 * 
 */
package com.grabandgo.server.health.service;

import com.grabandgo.server.commons.dto.ProductDetailsDto;

/**
 * @author Alexandr_I
 *
 */
public interface HealthService {

	ProductDetailsDto getProductDetails(String productId);
}
