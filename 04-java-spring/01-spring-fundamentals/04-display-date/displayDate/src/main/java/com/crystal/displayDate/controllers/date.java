package com.crystal.displayDate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class date {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
@RequestMapping("/date")
public String datePage(Model viewModel) {
	Date now = new Date();
	viewModel.addAttribute("day", now);
	return "date.jsp";
}

@RequestMapping("/time")
public String time(Model viewModel) {
//	LocalDateTime now = LocalDateTime.now();
	Date now = new Date();
	viewModel.addAttribute("time", now);
	return "time.jsp";
}
}
