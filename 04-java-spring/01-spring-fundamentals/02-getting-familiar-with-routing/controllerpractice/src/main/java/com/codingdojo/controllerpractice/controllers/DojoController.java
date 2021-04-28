package com.codingdojo.controllerpractice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping("")
	public String index() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping("/{locationName}")
	public String location(@PathVariable("locationName") String locationName) {
		System.out.println(locationName);
		if(locationName.equals("Burbank")) {
			System.out.println(locationName);
			return "Burbank is located in Southern California.";
		} else if (locationName.equals("san-jose")) {
			System.out.println(locationName);
			return "SJ dojo is the headquarters.";
		} else {
			System.out.println("There is no location");
			return "The dojo is awesome!";
		}
	}
}
