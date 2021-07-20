package com.sample.service;

import java.util.List;

import com.sample.vo.Product;

/**
 * 상품과 관련된 업무로직이 정의된 인터페이스다.
 * 여기 정의된 모든 기능은 ProductServiceImpl에서 구현된다.
 * @author jwhtt
 *
 */
public interface ProductService {

	/**
	 * 판매중인 모든 상품정보를 제공하는 서비스
	 * @return 상품정보 목록
	 */
	List<Product> getAllProducts();
}
