package com.sample.web.form;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserResisterForm {
	
	//입력필드의 name과 똑같은 이름으로 만들기!!!!
	private String id;
	private String password;
	private String passwordConfirm;
	private String name;
	private String email;
	private String phone;
}
