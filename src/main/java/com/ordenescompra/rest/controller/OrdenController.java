package com.ordenescompra.rest.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Orden orden) throws URISyntaxException{
		
		
		ordenService.save(orden);
		
		return ResponseEntity.created(new URI("/api/orden/save")).build();
		
		
		
	}
	
	
	
	
	
	

}
