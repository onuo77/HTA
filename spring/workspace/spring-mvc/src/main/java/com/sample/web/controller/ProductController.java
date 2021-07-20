package com.sample.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.service.ProductService;
import com.sample.vo.Product;

@Controller
@RequestMapping("/product")
public class ProductController {

	/*
	 * ProductService 인터페이스의 구현객체(ProductServiceImpl)가 주입된다.
	 */
	@Autowired
	private ProductService productService;
	
	/**
	 * 모든 상품목록 요청을 처리하는 요청핸들러 메소드 정의
	 * @param model 뷰페이지에 전달할 데이터를 담는 객체, HandlerAdapter객체가 Model을 생성해서 전달함
	 * @return 뷰페이지의 이름
	 */
	@GetMapping("/list")
	public String products(Model model) {
		List<Product> productList = productService.getAllProducts();
		
		// 뷰 페이지에 상품정보 목록 전달하기
		model.addAttribute("products", productList);
		
		// 뷰페이지로 내부이동하기
		// WEB-INF/views/product/list.jsp로 내부이동해서 JSP 실행시키기
		return "product/list";
	}
}
