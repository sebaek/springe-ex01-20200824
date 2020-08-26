package org.zerock.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@RequestMapping("/e")
	public ResponseEntity<String> methode() {
		log.info("e method");
		String body = "{\"name\":\"john\", \"age\":22}";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		
		ResponseEntity<String> response 
			= new ResponseEntity<>(body, header, HttpStatus.OK);
		
		return response;
	}
}












