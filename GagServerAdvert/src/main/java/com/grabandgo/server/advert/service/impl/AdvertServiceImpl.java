/**
 * 
 */
package com.grabandgo.server.advert.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grabandgo.server.advert.dto.AdvertDto;
import com.grabandgo.server.advert.dto.CartCoordinatesDto;
import com.grabandgo.server.advert.model.UserPreferences;
import com.grabandgo.server.advert.service.AdvertService;
import com.grabandgo.server.advert.service.ContextUserService;
import com.grabandgo.server.advert.service.LocationService;

/**
 * @author Alexandr_I
 *
 */
@Service
public class AdvertServiceImpl implements AdvertService {

	@Autowired
	private LocationService locationService;

	@Autowired
	private ContextUserService contextUserService;

	@Override
	public AdvertDto getAdvert(int cartId, Integer userId) {
		AdvertDto theResult = null;
		CartCoordinatesDto coord = locationService.getCoordinatesByCartId(cartId);
		if (userId != null) {
			UserPreferences userPrefs = contextUserService.getUserPreferences(userId);
			theResult = getAdvertByCoordinatesAndUserPrefs(coord, userPrefs);
		} else {
			theResult = getRandomAdvertByCoord(coord);
		}
		return theResult;
	}

	/**
	 * @param coord
	 * @param userPrefs
	 * @return
	 */
	private AdvertDto getAdvertByCoordinatesAndUserPrefs(CartCoordinatesDto coord, UserPreferences userPrefs) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param coord
	 * @return
	 */
	private AdvertDto getRandomAdvertByCoord(CartCoordinatesDto coord) {
		// TODO Auto-generated method stub
		return null;
	}

}
