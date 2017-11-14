/**
 * 
 */
package com.grabandgo.server.advert.service;

import com.grabandgo.server.advert.model.UserPreferences;

/**
 * @author Alexandr_I
 *
 */
public interface ContextUserService {

	UserPreferences getUserPreferences(Integer userId);

}
