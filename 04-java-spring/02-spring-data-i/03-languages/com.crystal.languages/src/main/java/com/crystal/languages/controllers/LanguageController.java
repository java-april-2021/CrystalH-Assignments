package com.crystal.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crystal.languages.models.Language;
import com.crystal.languages.services.LanguageService;

@RestController
public class LanguageController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("/")
	public List<Language> index(){
		return this.lService.getAllLanguages();
	}
	
	@GetMapping("/{id}")
	public Language etLanguage(@PathVariable("id") Long id) {
		return this.lService.getSingleLanguage(id);
	}
	
	@PostMapping("/create")
	public Language create(Language language) {
		return this.lService.createLanguage(language);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteLanguage(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
	}
	
	@PutMapping("/update/{id}")
	public Language updateLanguage(@PathVariable("id") Long id, Language updatedLanguage) {
		return this.lService.updateLanguage(updatedLanguage);
	}
}
