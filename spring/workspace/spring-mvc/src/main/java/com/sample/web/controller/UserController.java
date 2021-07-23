package com.sample.web.controller;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.service.UserService;
import com.sample.vo.User;
import com.sample.web.annotation.LoginUser;

@Controller
@RequestMapping("/my")
public class UserController {
	
	private static Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@GetMapping("/info")
	public String detail(@LoginUser User user, Model model) {
		logger.debug("detail() 실행됨");
		logger.info("로그인된 사용자 정보 : " + user);
		if(user == null) {
			throw new RuntimeException("사용자 상세정보 조회는 로그인 후 사용가능한 서비스입니다.");
		}
		
		// 사용자 상세정보 조회
		Map<String, Object> userDetailMap = userService.getUserDetail(user.getId());
		model.addAttribute("user",userDetailMap.get("user"));
		model.addAttribute("cartItems",userDetailMap.get("cartItems"));
		model.addAttribute("orders",userDetailMap.get("orders"));
		model.addAttribute("reviews",userDetailMap.get("reviews"));
		model.addAttribute("pointHistories",userDetailMap.get("pointHistories"));
		
		logger.debug("detail() 종료됨");
		
		return "user/info";
	}
}
