/**
 * 
 */
package com.grabandgo.server.advert.service;

import com.grabandgo.server.advert.dto.AdvertDto;

/**
 * @author Alexandr_I
 *
 */
public interface AdvertService {

	AdvertDto getAdvert(int cartId, Integer userId);

}
