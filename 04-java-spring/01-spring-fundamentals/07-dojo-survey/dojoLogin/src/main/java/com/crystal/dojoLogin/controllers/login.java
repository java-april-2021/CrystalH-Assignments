package com.crystal.dojoLogin.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class login {
	@RequestMapping("/")
	public String dojoLogin(HttpSession session) {
		return "index.jsp";
	}

	
	@PostMapping("/login")
	public String result(@RequestParam("name") String name, @RequestParam("language") String language, @RequestParam("location") String location, @RequestParam(value="comment", required = false) String comment){

		return "result.jsp";
	}
}
