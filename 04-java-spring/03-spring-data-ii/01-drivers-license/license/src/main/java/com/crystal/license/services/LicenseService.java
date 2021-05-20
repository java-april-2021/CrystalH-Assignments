package com.crystal.license.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crystal.license.models.License;
import com.crystal.license.repositories.LicenseRepository;

@Service
public class LicenseService {
	@Autowired
	private LicenseRepository lRepo;
	
	public License createLicense(License license) {
		return this.lRepo.save(license);
	}
}
