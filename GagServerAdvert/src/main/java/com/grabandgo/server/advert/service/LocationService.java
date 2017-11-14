/**
 * 
 */
package com.grabandgo.server.advert.service;

import com.grabandgo.server.advert.dto.CartCoordinatesDto;

/**
 * @author Alexandr_I
 *
 */
public interface LocationService {

	CartCoordinatesDto getCoordinatesByCartId(int cartId);

}
