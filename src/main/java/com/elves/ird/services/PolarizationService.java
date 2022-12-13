package com.elves.ird.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elves.ird.entities.Polarization;
import com.elves.ird.repositories.PolarizationRepository;



@Service
public class PolarizationService {
	
	@Autowired
	private PolarizationRepository repository;
	
	public List<Polarization> findAll(){
		return repository.findAll();
	}
}
