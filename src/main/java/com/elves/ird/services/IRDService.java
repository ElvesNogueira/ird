package com.elves.ird.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elves.ird.dto.IRDDTO;
import com.elves.ird.entities.Channel;
import com.elves.ird.entities.IRD;
import com.elves.ird.repositories.IRDRepository;
import com.elves.ird.services.exceptions.DataBaseException;
import com.elves.ird.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class IRDService {

	@Autowired
	private IRDRepository repository;

	@Autowired
	private ChannelService channelService;

	public List<IRD> findAll() {
		return repository.findAll();
	}

	public IRD findById(Long id) {
		Optional<IRD> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public IRD insert(IRD obj) {

		return repository.save(obj);
	}

	public void delete(Long id) throws Exception {
		try {
			repository.deleteById(id);
		} catch (ResourceNotFoundException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataBaseException e) {
			throw new DataBaseException(e.getMessage());
		}

	}

	public IRD update(Long id, IRD obj) throws Exception {

		try {
			IRD entity = repository.getReferenceById(id);
			upadateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}

	}

	private void upadateData(IRD entity, IRD obj) {

		entity.setModel(obj.getModel());
		entity.setPolarization(obj.getPolarization());
		entity.setTid(obj.getTid());
		entity.setUa(obj.getUa());
	}

	public IRD fromDTO(IRDDTO objDto) {
		return new IRD(objDto.getId(), objDto.getModel(), objDto.getTid(), objDto.getUa(), objDto.getPolarization(),
				objDto.getSatellite());
	}

	public void insertChannelById(Long id, Long ird) throws Exception {
		IRD obj = findById(ird);
		channelService.insertIRDById(id, obj);
	}

	public void deleteChannelById(Long id) throws Exception {

		try {
			Channel ch = channelService.findById(id);
			channelService.deleteIRDById(ch.getId());
		} catch (ResourceNotFoundException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataBaseException e) {
			throw new DataBaseException(e.getMessage());
		}

	}

}
