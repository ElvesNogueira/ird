package com.elves.ird.services;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elves.ird.entities.IRD;
import com.elves.ird.repositories.IRDRepository;

@Service
public class IRDService {

	@Autowired
	private IRDRepository repository;

	public List<IRD> findAll() {
		return repository.findAll();
	}

	public IRD findById(Long id) {
		Optional<IRD> obj = repository.findById(id);
		return obj.orElseThrow(() ->  new ObjectNotFoundException(id,"Object not found"));
	}
	
	public IRD insert(IRD satellite) {
		
		return repository.save(satellite);
	}
	
	public void delete (Long id) {
		repository.deleteById(id);
	}
	
	public void update(Long id, IRD obj) throws SQLException{
		
		
		repository.deleteById(id); 
		
		
		if(repository.findById(id)!= null) {
		repository.save(obj);
		obj.setId(id);
		}else {
			throw new SQLException("ERROR!");
		}
	}
	
	
}
