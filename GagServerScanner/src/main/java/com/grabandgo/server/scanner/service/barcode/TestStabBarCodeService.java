/**
 * 
 */
package com.grabandgo.server.scanner.service.barcode;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.grabandgo.server.commons.dto.ProductDetailsDto;
import com.grabandgo.server.scanner.dto.BarCodeRequestDto;
import com.grabandgo.server.scanner.jpa.ProductRepository;
import com.grabandgo.server.scanner.model.Product;
import com.grabandgo.server.scanner.utils.DtoStabFactory;
import com.grabandgo.server.scanner.utils.DtoUtils;

/**
 * @author Alexandr_I
 *
 */
@Service
@Qualifier("testStabBarCodeService")
public class TestStabBarCodeService implements BarCodeService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public ProductDetailsDto getProductDetailsByBarCode(BarCodeRequestDto barReq) {
		ProductDetailsDto theResult = null;
		List<Product> l = productRepository.findAll();
		Product res = productRepository.findProductByBarCode("6548435184");
		if (l.size() > 0) {
			Random r = new Random();
			Product item = l.get(r.nextInt(l.size() - 1));
			theResult = DtoUtils.convertProductToDto(item);
		} else {
			theResult = DtoStabFactory.getNoSuchProductStub();
		}
		return theResult;
	}

}
