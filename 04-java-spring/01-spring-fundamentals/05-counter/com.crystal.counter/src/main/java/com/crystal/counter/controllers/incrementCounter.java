package com.crystal.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class incrementCounter {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		}
		int totalCount = (int)session.getAttribute("count");
		totalCount++;
		session.setAttribute("count", totalCount);
		return "index.jsp";
	}
	
@RequestMapping("/counter")
public String totalCount(HttpSession session, Model viewModel) {
	if(session.getAttribute("count") == null) {
		session.setAttribute("count", 1);
	}
	int totalCount = (int)session.getAttribute("count");
	viewModel.addAttribute("totalCount", totalCount);
	return "counter.jsp";
	}
}
