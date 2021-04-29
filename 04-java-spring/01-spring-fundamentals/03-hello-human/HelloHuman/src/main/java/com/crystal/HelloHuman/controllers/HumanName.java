package com.crystal.HelloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HumanName {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false, defaultValue="Human") String nameQuery, Model model) { 
		model.addAttribute("name", nameQuery); 
		System.out.println(nameQuery);
		return "index.jsp";
	}
}
