package com.crystal.theCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class loginError {
	@RequestMapping("/")
	public String index(@ModelAttribute("errors") String errors, Model viewModel) {
		if(errors != null) {
			viewModel.addAttribute("errorMessage", errors);
		}
		return "index.jsp";
	}	
	

		
	
	@PostMapping("/tryCode")
	public String index(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		if(code.equals("bushido")) {
			return "redirect:/result";
		}
		redirectAttributes.addFlashAttribute("errors", "You must train harder!");
		return "redirect:/";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "result.jsp";
	}
}
