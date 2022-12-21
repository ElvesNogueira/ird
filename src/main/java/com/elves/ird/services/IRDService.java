package com.elves.ird.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.elves.ird.entities.IRD;
import com.elves.ird.repositories.IRDRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class IRDService {

	@Autowired
	private IRDRepository repository;

	public List<IRD> findAll() {
		return repository.findAll();
	}

	public IRD findById(Long id) {
		Optional<IRD> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(id, "Object not found"));
	}

	public IRD insert(IRD obj) {

		return repository.save(obj);
	}

	public void delete(Long id) throws Exception {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new Exception(e.getMessage());
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException(e.getMessage());
		}

	}

	public IRD update(Long id, IRD obj) throws Exception {

		try {
			IRD entity = repository.getReferenceById(id);
			upadateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new Exception(e.getMessage());
		}

	}

	private void upadateData(IRD entity, IRD obj) {

		entity.setModel(obj.getModel());
		entity.setPolarization(obj.getPolarization());
		entity.setTid(obj.getTid());
		entity.setUa(obj.getUa());
	}

}
