package com.elves.ird.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.elves.ird.dto.ChannelDTO;
import com.elves.ird.entities.Channel;
import com.elves.ird.entities.IRD;
import com.elves.ird.repositories.ChannelRepository;
import com.elves.ird.services.exceptions.DataBaseException;
import com.elves.ird.services.exceptions.ResourceNotFoundException;

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
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Channel insert(Channel obj) {

		return repository.save(obj);
	}

	public void delete(Long id) throws Exception {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException(e.getMessage());
		}

	}

	public List<Channel> findChannelBySid(Integer sid) {
		List<Channel> list = findAll();
		List<Channel> listNew = list.stream().filter(x -> x.getSid() == sid).collect(Collectors.toList());

		return listNew;
	}

	public Channel update(Long id, Channel obj) throws Exception {

		try {
			Channel entity = repository.getReferenceById(id);
			upadateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}

	}

	private void upadateData(Channel entity, Channel obj) {

		entity.setName(obj.getName());
		entity.setIrd(obj.getIrd());
		entity.setSid(obj.getSid());
	}

	public Channel fromDTO(ChannelDTO objDTO) {
		return new Channel(objDTO.getId(), objDTO.getName(), objDTO.getSid());
	}

	public Channel insertIRDById(Long id, IRD ird) throws Exception {
		try {
			Channel entity = findById(id);

			entity.setIrd(ird);

			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	public Channel deleteIRDById(Long id) throws Exception {
		try {
			Channel entity = findById(id);

			entity.setIrd(null);

			return repository.save(entity);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException(e.getMessage());
		}
	}

}
