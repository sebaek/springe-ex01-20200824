package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/res")
@Log4j
public class ResponseController {

	@RequestMapping("/a")
	public String methoda() {
		log.info("a method");
		
		return "/res/a";
	}
	
	@RequestMapping("/b")
	@ResponseBody
	public String methodb() {
		log.info("b method");
		
		return "hello b method";
	}
	
	@RequestMapping("/c")
	@ResponseBody
	public String methodc() {
		log.info("c method");
		
		return "<li>john, 22</li><li>jane, 33</li>";
	}
	
	@RequestMapping("/d")
	@ResponseBody
	public String methodd() {
		log.info("d method");
		
		return "{\"name\":\"john\", \"age\":22}";
	}
}












