package com.crystal.license.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crystal.license.models.Person;
import com.crystal.license.services.PersonService;

@RestController
@RequestMapping("/api")
public class APIPersonController {
	@Autowired
	private PersonService pService;
	
	@GetMapping("")
	public List<Person> index(){
		return this.pService.getAllPersons();
	}
	
	@GetMapping("/{id}")
	public Person getPerson(@PathVariable("id") Long id) {
		return this.pService.getSinglePerson(id);
	}
	
	@PostMapping("/create")
	public Person create(Person person) {
		return this.pService.createPerson(person);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deletePerson(@PathVariable("id") Long id) {
		this.pService.deletePerson(id);
	}
	
	@PutMapping("/update/{id}")
	public Person updatePerson(@PathVariable("id") Long id, Person updatedPerson) {
		return this.pService.updatePerson(updatedPerson);
	}
}
