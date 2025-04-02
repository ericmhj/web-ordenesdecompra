package com.ordenescompra.rest.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ordenescompra.rest.entities.Orden;
import com.ordenescompra.rest.serviceImpl.OrdenServiceImpl;

@RestController
@RequestMapping("/api/orden")
public class OrdenController {

	
	@Autowired
	private OrdenServiceImpl ordenService;
	
	
	@GetMapping("/findAll")
	public ResponseEntity<?> findAll(){
		
		List<Orden>  ordenList = ordenService.findAll();
		
		return ResponseEntity.ok(ordenList);
		
	}
	
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id){
		
		Optional<Orden> ordenOptional = ordenService.findById(id);
		
		return ResponseEntity.ok(ordenOptional.get());
		
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Orden orden) throws URISyntaxException{
						
		ordenService.save(orden);
		
		return ResponseEntity.created(new URI("/api/orden/save")).build();
		
			
	}
	
	
	
	
	
	

}
