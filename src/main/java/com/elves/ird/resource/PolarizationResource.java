package com.elves.ird.resource;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elves.ird.Polarization;
import com.elves.ird.services.PolarizationService;

@RestController
@RequestMapping("/polarizations")
public class PolarizationResource {
	
	@Autowired
	PolarizationService service;
	
	@GetMapping
	public List<Polarization> findAll(){
		
		List<Polarization> list=   new ArrayList<>(); 
		list=service.findAll();
		
		return list;
	}
}
