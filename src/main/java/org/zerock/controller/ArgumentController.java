package org.zerock.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/arg/*")
@Log4j
public class ArgumentController {
	
	// /arg/a?name=john
	@RequestMapping("/a")
	public void method1(HttpServletRequest req) {
		log.info(req);
		log.info(req.getParameter("name"));
	}
	
	@RequestMapping("/b")
	public void method2(@RequestParam("name") String name) {
		log.info("b method");
		log.info(name);
	}
	
	@RequestMapping("/c")
	public void method3(@RequestParam String name) {
		log.info("c method");
		log.info(name);
	}
	
	@RequestMapping("/d")
	public void method4(String name) {
		log.info("d method");
		log.info(name);
	}
	
	// /e?name=jane&age=100
	@RequestMapping("/e")
	public void method5(HttpServletRequest req) {
		log.info("e method");
		log.info(req.getParameter("name"));
		log.info(req.getParameter("age"));
	}
	
	@RequestMapping("/f")
	public void method6(String name, String age) {
		log.info("f method");
		log.info(name);
		log.info(age);
		
		int ageInt = Integer.valueOf(age);
	}
	
	@RequestMapping("/g")
	public void method7(String name, int age) {
		log.info("g method");
		log.info(name);
		log.info(age);
	}
}
















