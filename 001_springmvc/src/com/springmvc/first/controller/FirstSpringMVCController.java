package com.springmvc.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class FirstSpringMVCController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@RequestMapping("/message")
	public String sendMessage(Model m) {
		m.addAttribute("message1", "Batch 2 for Spring");
		m.addAttribute("message2", "Hello Spring Drawing Room");
		m.addAttribute("message3", "Hello Spring Verandha");
		return "kitchen";
	}
	
	@RequestMapping("/supermessage")
	public ModelAndView sendSuperMessage(ModelAndView mv) {
		mv.addObject("food", "Hellow from Model And View");
		mv.setViewName("canteen");
		return mv;
	}
	

}
