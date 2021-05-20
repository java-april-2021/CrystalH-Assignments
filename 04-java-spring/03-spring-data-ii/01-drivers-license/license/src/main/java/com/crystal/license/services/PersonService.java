package com.crystal.license.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crystal.license.models.Person;
import com.crystal.license.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository pRepo;

	public PersonService(PersonRepository repo) {
		this.pRepo = repo;
	}

	public List<Person> getAllPersons(){
		return this.pRepo.findAll();
	}

	public Person getSinglePerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}

	public Person createPerson(Person newPerson) {
		return this.pRepo.save(newPerson);
	}

	public Person updatePerson(Person person) {
		return this.pRepo.save(person);
	}

	public void deletePerson(Long id) {
		this.pRepo.deleteById(id);
	}
}
