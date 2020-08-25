package org.zerock.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.CustomMemberEditor;
import org.zerock.domain.Member;
import org.zerock.domain.MemberList;

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
	
	@RequestMapping("/h")
	public void method8(String name, int age) {
		log.info("h method");
		
		Member member = new Member();
		member.setName(name);
		member.setAge(age);
		
		log.info(member);
	}
	
	@RequestMapping("/i")
	public void method9(Member member) {
		log.info("i method");
		log.info(member);
	}
	
	@RequestMapping("/j")
	public void method10(@RequestParam String[] name) {
		log.info("j method");
		log.info(name.length);
		for (String n : name) {
			log.info(n);
		}
	}
	
	@RequestMapping("/k")
	public void method11(@RequestParam("n") List<String> name) {
		log.info("k method");
		log.info(name.size());
		for (String n : name) {
			log.info(n);
		}
	}
	
	@RequestMapping("/l")
	public void method12(MemberList member) {
		log.info("l method");
		log.info(member);
		
	}
	
	@RequestMapping("/m")
	public void method13(@RequestParam("date") Date date) {
		log.info("m method");
		log.info(date);
	}
	
	@RequestMapping("/n")
	public void method14(@RequestParam("mem") Member member) {
		log.info("n method");
		log.info(member);
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		log.info("init binder");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder
		.registerCustomEditor(Date.class, new CustomDateEditor(format, false));
		binder
		.registerCustomEditor(Member.class, new CustomMemberEditor());
	}
}
















