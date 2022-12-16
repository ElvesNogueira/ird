package com.elves.ird.services;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elves.ird.entities.Channel;
import com.elves.ird.repositories.ChannelRepository;

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
	
	public Channel insert(Channel satellite) {
		
		return repository.save(satellite);
	}
	
	public void delete (Long id) {
		repository.deleteById(id);
	}
	
	public void update(Long id, Channel obj) throws SQLException{
		
		
		repository.deleteById(id); 
		
		
		if(repository.findById(id)!= null) {
		repository.save(obj);
		obj.setId(id);
		}else {
			throw new SQLException("ERROR!");
		}
	}
	
	
}
