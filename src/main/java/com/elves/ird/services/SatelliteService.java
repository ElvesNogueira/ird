package com.elves.ird.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elves.ird.entities.Satellite;
import com.elves.ird.repositories.SatelliteRepository;

@Service
public class SatelliteService {

	@Autowired
	private SatelliteRepository repository;

	public List<Satellite> findAll() {
		return repository.findAll();
	}

	public Satellite findById(Long id) {
		Optional<Satellite> obj = repository.findById(id);
		return obj.orElseThrow(() ->  new ObjectNotFoundException(id,"Object not found"));
	}
	
	public void insert(Satellite satellite) {
		
	}
}
