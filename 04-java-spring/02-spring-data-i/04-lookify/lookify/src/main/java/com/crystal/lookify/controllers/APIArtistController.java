package com.crystal.lookify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crystal.lookify.models.Artist;
import com.crystal.lookify.services.ArtistService;

@RestController
@RequestMapping("/api")
public class APIArtistController {
	@Autowired
	private ArtistService aService;
	
	@GetMapping("")
	public List<Artist> index(){
		return this.aService.getAllArtists();
	}
	
	@GetMapping("/{id}")
	public Artist getArtist(@PathVariable("id") Long id) {
		return this.aService.getSingleArtist(id);
	}
	
	@PostMapping("/create")
	public Artist create(Artist artist) {
		return this.aService.createArtist(artist);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteArtist(@PathVariable("id") Long id) {
		this.aService.deleteService(id);
	}
		
	@PutMapping("/update/{id}")
	public Artist updateArtist(@PathVariable("id") Long id, Artist updatedArtist) {
		return this.aService.updateArtist(updatedArtist);
	}
}
