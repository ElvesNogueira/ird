package com.elves.ird.resource;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

import com.elves.ird.dto.IRDDTO;
import com.elves.ird.entities.IRD;
import com.elves.ird.services.IRDService;

@RestController
@RequestMapping("IRDs")
public class IRDResource {

	@Autowired
	IRDService service;

	@GetMapping
	public ResponseEntity<List<IRDDTO>> findAll() {

		List<IRD> list = new ArrayList<>();
		list = service.findAll();
		List<IRDDTO> listDto = list.stream().map(x -> new IRDDTO(x)).collect(Collectors.toList());

		return ResponseEntity.ok().body(listDto);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<IRDDTO> findById(@PathVariable Long id) {

		IRD obj = service.findById(id);

		return ResponseEntity.ok().body(new IRDDTO(obj));
	}

	@PostMapping()
	public ResponseEntity<Void> insert(@RequestBody IRDDTO objDto) {
		IRD obj = service.fromDTO(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<IRDDTO> delete(@PathVariable Long id) throws Exception {
		service.delete(id);

		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Void> update(@RequestBody IRDDTO objDto, @PathVariable Long id) throws Exception {

		IRD obj = service.fromDTO(objDto);
		obj.setId(id);
		service.update(obj.getId(), obj);

		return ResponseEntity.noContent().build();
	}
}
