package com.elves.ird.resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elves.ird.entities.Satellite;

@RestController
@RequestMapping("/satellites")
public class IrdResource {
	
	@GetMapping
	public ResponseEntity<Satellite> findAll(){
		
		return ResponseEntity.ok().body(null);
	}
}
