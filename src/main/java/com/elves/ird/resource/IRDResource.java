package com.elves.ird.resource;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.elves.ird.entities.IRD;
import com.elves.ird.services.IRDService;

@RestController
@RequestMapping("IRDs")
public class IRDResource {

	@Autowired
	IRDService service;

	@GetMapping
	public ResponseEntity<List<IRD>>  findAll() {

		List<IRD> list = new ArrayList<>();
		list = service.findAll();

		return ResponseEntity.ok().body(list) ;
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<IRD> findById(@PathVariable Long id) {

		IRD obj = service.findById(id);

		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping()
	public ResponseEntity<Void> insert(@RequestBody IRD obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception{
		service.delete(id);
		
		return ResponseEntity.noContent().build();
	}
	@PutMapping(value = "/{id}")
	public ResponseEntity<IRD> update(@PathVariable Long id,@RequestBody IRD obj) throws Exception{
		service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
