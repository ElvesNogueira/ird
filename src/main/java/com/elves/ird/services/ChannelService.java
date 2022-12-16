package com.elves.ird.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.elves.ird.entities.Channel;
import com.elves.ird.repositories.ChannelRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ChannelService {

	@Autowired
	private ChannelRepository repository;

	public List<Channel> findAll() {
		return repository.findAll();
	}

	public Channel findById(Long id) {
		Optional<Channel> obj = repository.findById(id);
		return obj.orElseThrow(() ->  new ObjectNotFoundException(id,"Object not found"));
	}
	
	public Channel insert(Channel obj) {
		
		return repository.save(obj);
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
	
	public Channel update(Long id, Channel obj) throws Exception{
		
		
		try {
			Channel entity = repository.getReferenceById(id);
			upadateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new Exception(e.getMessage());
		}
		
	}
	
	private void upadateData(Channel entity, Channel obj) {

		entity.setName(obj.getName());
//		entity.setIrd(obj.getIrd());
		entity.setSid(obj.getSid());
	}
	
}
