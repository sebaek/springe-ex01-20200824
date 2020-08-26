package org.zerock.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.Member;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/ret")
@Log4j
public class ReturnController {

	@RequestMapping("/a")
	public void methoda() {
		log.info("a method");
	}

	@RequestMapping("/b")
	public String methodb() {
		log.info("b method");

		return "/ret/a";
	}

	@RequestMapping("/c")
	@ResponseBody
	public String methodc() {
		log.info("c method");

		return "hello world";
	}

	@RequestMapping("/d")
	public String methodd(Model model) {
		log.info("d method");

		model.addAttribute("myAttr", "my-val");

		return "/ret/a";
	}

	@RequestMapping("/e")
	public String methode(Model model) {
		log.info("e method");

		Member member = new Member();
		member.setName("john");
		member.setAge(999);

		model.addAttribute("mem", member);

		return "/ret/a";
	}

	@RequestMapping("/f")
	public String methodf(Model model) {
		log.info("f method");
		Member member = new Member();
		member.setName("seoul");
		member.setAge(1000);
		model.addAttribute(member);

		return "/ret/a";
	}

	@RequestMapping("/g")
	public String methodg(Model model) {
		log.info("g method");

		String[] strs = new String[] { "seoul", "jeju", "korea" };
		model.addAttribute("cities", strs);

		return "/ret/b";
	}

	@RequestMapping("/h")
	public String methodh(Model model) {
		log.info("h method");

		Member m1 = new Member();
		m1.setName("seoul");
		m1.setAge(22);

		Member m2 = new Member();
		m2.setName("korea");
		m2.setAge(33);

		// 배열
		Member[] members = new Member[] { m1, m2 };
//		model.addAttribute("memberList", members);
		model.addAttribute(members);

		// List
		List<Member> members2 = new ArrayList<>();
		members2.add(m1);
		members2.add(m2);
//		model.addAttribute("memberList", members2);
		model.addAttribute(members2);

		return "/ret/b";
	}

	// /i?name=jeju
	@RequestMapping("/i")
	public String methodi(@ModelAttribute("name") String name) {
		log.info("i method");
		log.info(name);

		return "/ret/c";
	}

	// /j?name=jeju&age=33
	@RequestMapping("/j")
	public String methodj(Member member) {
		log.info("j method");

		return "/ret/c";
	}

	// /j?name=jeju&age=33
	@RequestMapping("/k")
	public String methodk(@ModelAttribute("mem") Member member) {
		log.info("k method");

		return "/ret/c";
	}
	
	@RequestMapping("/l")
	public String methodl(Model model, RedirectAttributes rttr) {
		log.info("l method");
		
		model.addAttribute("myAttr1", "myValue1");
		rttr.addFlashAttribute("myRedirectAttr1", "myRedirectValue1");
		rttr.addAttribute("myRedirectAttr2", "myRedirectValue2");
		
		
//		String contextPath = request.getContextPath();
//		response.sendRedirect(contextPath + "/ret/m");
		
		return "redirect:/ret/m";
//		return "redirect:m";
	}
	
	@RequestMapping("/m")
	public String methodm(Model model) {
		log.info("m method");
		
//		model.addAttribute("myAttr1", "myValue1");
		
		return "/ret/m";
	}
	
	
	
	
}



