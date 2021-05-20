package com.crystal.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.crystal.lookify.models.Artist;
import com.crystal.lookify.services.ArtistService;

@Controller
public class ArtistController {
	@Autowired
	private ArtistService aService;
	
	@GetMapping("/")
	public String index(Model viewModel) {
		List<Artist> allArtists = this.aService.getAllArtists();
		viewModel.addAttribute("artists", allArtists);
		return "index.jsp";
	}
	
	@GetMapping("/add")
	public String addArtist(@ModelAttribute("artist") Artist artist) {
		return "index.jsp";
	}
	
	@PostMapping("/add")
	public String newArtist(@Valid @ModelAttribute("artist") Artist artist, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		this.aService.createArtist(artist);
		return "redirect:/";
	}
}
