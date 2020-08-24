package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/my/*")
@Log4j
public class MyController {
	
	@RequestMapping("")
	public void myHandler1() {
		log.info("my controller is working.....");
	}

}




