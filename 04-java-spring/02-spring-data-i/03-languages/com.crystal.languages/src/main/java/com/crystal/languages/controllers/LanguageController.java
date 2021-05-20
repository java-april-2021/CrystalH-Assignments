package com.crystal.languages.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crystal.languages.models.Language;
import com.crystal.languages.services.LanguageService;

@Controller
@RequestMapping("/languages")
public class LanguageController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("")
	public String index(Model viewModel) {
		List<Language> allLanguages = this.lService.getAllLanguages();
		viewModel.addAttribute("languages", allLanguages);
		return "index.jsp";
	}
	
	@GetMapping("/add")
	public String addLanguage(@ModelAttribute("language") Language language) {
		return "new.jsp";
	}
	
	@PostMapping("/add")
	public String newLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		this.lService.createLanguage(language);
		return "redirect:/";
	}
	
	@GetMapping("/{id}")
	public String getLanguage(@PathVariable("id") Long id, Model viewModel) {
		Language singleLanguage = this.lService.getSingleLanguage(id);
		viewModel.addAttribute("language", singleLanguage);
		return "display.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String updateLanguage(@PathVariable("id") Long id, Language updatedLanguage, Model viewModel, RedirectAttributes redirectAttr) {
		Language singleLanguage = this.lService.getSingleLanguage(id);
		viewModel.addAttribute("language", singleLanguage);
		return "edit.jsp";
	}

	@PostMapping("/edit/{id}")
	public String updateLanguage(@PathVariable("id") Long id, @RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("version") String version, RedirectAttributes redirectAttr) {
		ArrayList<String> errors = new ArrayList<String>();
		System.out.println("Hello");
		if(name.equals("")) {
			errors.add("Must add name.");
		}
		if(creator.equals("")) {
			errors.add("Must add creator.");
		}
		if(version.equals("")) {
			errors.add("Must add the version.");
		}
		 try 
	        {
	            // checking valid integer using parseInt() method
	            Integer.parseInt(version);
	            System.out.println(version + " is a valid integer number");
	        } 
	        catch (NumberFormatException e) 
	        {
	            errors.add("Must be a valid integer.");
	        }
		if(errors.size() > 0) {
//			for(String e : errors) {
				redirectAttr.addFlashAttribute("errors", errors);
//			}
			return "redirect:/languages/edit/{id}";
		}
		
		Language singleLanguage = this.lService.getSingleLanguage(id);
		singleLanguage.setName(name);
		singleLanguage.setCreator(creator);
		singleLanguage.setVersion(Integer.parseInt(version));
		this.lService.updateLanguage(singleLanguage);
		return "redirect:/languages/edit/{id}";
	}
	
	@GetMapping(value="/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		Language singleLanguage = this.lService.getSingleLanguage(id);
		this.lService.deleteLanguage(id);
		return "redirect:/languages";
	}
}
