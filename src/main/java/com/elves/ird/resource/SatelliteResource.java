package com.elves.ird.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elves.ird.entities.Satellite;
import com.elves.ird.services.SatelliteService;

@RestController
@RequestMapping("/satellites")
public class SatelliteResource {

	@Autowired
	SatelliteService service;

	@GetMapping
	public List<Satellite> findAll() {

		List<Satellite> list = new ArrayList<>();
		list = service.findAll();

		return list;
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Satellite> findById(@PathVariable Long id) {

		Satellite obj = service.findById(id);

		return ResponseEntity.ok().body(obj);
	}
}
