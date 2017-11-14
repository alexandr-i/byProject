/**
 * 
 */
package com.grabandgo.server.scanner.service.barcode;

import com.grabandgo.server.commons.dto.ProductDetailsDto;
import com.grabandgo.server.scanner.dto.BarCodeRequestDto;

/**
 * @author Alexandr_I
 *
 */
public interface BarCodeService {

	ProductDetailsDto getProductDetailsByBarCode(BarCodeRequestDto barReq);
}
