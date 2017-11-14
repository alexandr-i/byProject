/**
 * 
 */
package com.grabandgo.server.scanner.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.grabandgo.server.scanner.model.Currency;

/**
 * @author Alexandr_I
 *
 */
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {

	@Query(value = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES ", nativeQuery = true)
	List<String> getAllTables();

	@Query(value = "SELECT DISTINCT(NAME) FROM PRODUCT", nativeQuery = true)
	List<String> getAllDataProduct();
	
	@Query(value = "SELECT COUNT(*) FROM PRODUCT", nativeQuery = true)
	Integer getAllCountProduct();
}
