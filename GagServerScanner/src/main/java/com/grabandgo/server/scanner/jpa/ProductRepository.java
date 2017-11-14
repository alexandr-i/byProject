package com.grabandgo.server.scanner.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grabandgo.server.scanner.model.Product;

/**
 * @author Alexandr_I
 *
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findProductByBarCode(String barCode);
}
