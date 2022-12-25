package com.elves.ird.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.elves.ird.entities.Satellite;
import com.elves.ird.repositories.SatelliteRepository;

import jakarta.persistence.EntityNotFoundException;

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
	
	public Satellite insert(Satellite satellite) {
		
		return repository.save(satellite);
	}
	
	public void delete (Long id) throws Exception {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new Exception(e.getMessage());
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException(e.getMessage());
		}
		
		
	}
	
	public Satellite update(Long id, Satellite obj) throws Exception{
		
		
		try {
			Satellite entity = repository.getReferenceById(id);
			upadateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new Exception(e.getMessage());
		}
		
	}
	
	private void upadateData(Satellite entity, Satellite obj) {

		entity.setName(obj.getName());
	}
	
}
