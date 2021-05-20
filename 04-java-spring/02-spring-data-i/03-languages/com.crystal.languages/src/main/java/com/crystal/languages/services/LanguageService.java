package com.crystal.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crystal.languages.models.Language;
import com.crystal.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	
	public List<Language> getAllLanguages(){
		return this.lRepo.findAll();
	}
	
	public Language getSingleLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	
	public Language updateLanguage(Language language) {
		return this.lRepo.save(language);
	}
	
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
	
	public Language createLanguageHTMl(String name, String creator, int version) {
		Language newLanguage = new Language(name, creator, version);
		return this.lRepo.save(newLanguage);
	}
}
