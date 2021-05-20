package com.crystal.license.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crystal.license.models.License;
import com.crystal.license.models.Person;
import com.crystal.license.services.LicenseService;
import com.crystal.license.services.PersonService;

@Controller
public class PersonController {
	@Autowired 
	private PersonService pService;
	@Autowired
	private LicenseService lService;
	
	@GetMapping("/")
	public String index(Model viewModel, @ModelAttribute("person") Person person) {
		List<Person> allPersons = this.pService.getAllPersons();
		viewModel.addAttribute("persons", allPersons);
		return "index.jsp";
	}
	
	@GetMapping("/add")
	public String addPerson(@ModelAttribute("person") Person person) {
		return "index.jsp";
	}
	
	@GetMapping("/{id}")
	public String showPerson(@PathVariable("id") Long id, Model viewModel) {
		Person personToShowcase = this.pService.getSinglePerson(id);
		viewModel.addAttribute("person", personToShowcase);
		return "display.jsp";
	}
	
	@PostMapping("/addLicense/{id}")
	public String addLicense(@Valid @ModelAttribute("license") License license, BindingResult result, @PathVariable("id") Long id) {
		Person personToAdd = this.pService.getSinglePerson(id);
		license.setPerson(personToAdd);
		this.lService.createLicense(license);
		return "redirect:/{id}";
	}
	
	@PostMapping("/add")
	public String newPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		this.pService.createPerson(person);
		return "redirect:/";
	}
}
