/**
 * 
 */
package com.grabandgo.server.advert.jpa;

import java.util.Currency;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Alexandr_I
 *
 */
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {//TODO Currency class

	@Query(value = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES ", nativeQuery = true)
	List<String> getAllTables();

	@Query(value = "SELECT DISTINCT(NAME) FROM PRODUCT", nativeQuery = true)
	List<String> getAllDataProduct();
	
	@Query(value = "SELECT COUNT(*) FROM PRODUCT", nativeQuery = true)
	Integer getAllCountProduct();
}
