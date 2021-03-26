package com.engine.staysmart.sss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engine.staysmart.sss.DAO.Usersimpl;
import com.engine.staysmart.sss.entity.User;

@RestController
@RequestMapping("/")
public class Controller {

	@Autowired
	private Usersimpl usersimpl;
	
	@GetMapping("/getproductdetails")
	public List<User>getuserdetails(){
		return usersimpl.getuserdetails();
		
	}
	
	@GetMapping("/getproducts")
	public List<User>getuserdetails2(){
		return usersimpl.getuserdetails();
		
	}
	@GetMapping("/hello")
	public String hello() {
		return "welcome to spring-boot-docker-image";
	}
}