package com.crystal.license.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crystal.license.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {

}
