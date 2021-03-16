package com.dedoublonnesalaire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dedoublonnesalaire.entities.Salarie;
import com.dedoublonnesalarie.service.SalarieService;

@RestController
@RequestMapping("api/salarie/")
public class SalarieController {
	
	@Autowired
	private final SalarieService salarieserv;
	
	public SalarieController(SalarieService salarieserv) {
		
		this.salarieserv = salarieserv;
	}
	
	@PostMapping
	public ResponseEntity<List<Salarie>> addSalarie(@RequestBody Salarie salarie) {
		salarieserv.addSalarie(salarie);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}
	
	@PutMapping
	public ResponseEntity<List<Salarie>> updateSalarie(@RequestBody Salarie salarie) {
		salarieserv.updateSalarie(salarie);
		return ResponseEntity.ok().build();
	}
	@GetMapping
	public ResponseEntity<List<Salarie>> getAllSalarie() {
		return ResponseEntity.ok(salarieserv.getAllSalarie());
	}
	public void getSalarieByFirstName() {}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<List<Salarie>> deleteSalarie(@PathVariable Long id) {
		salarieserv.deleteSalarie(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
	}
		
	
	
}


