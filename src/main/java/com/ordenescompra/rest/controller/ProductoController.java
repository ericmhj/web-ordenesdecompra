package com.ordenescompra.rest.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ordenescompra.rest.entities.Producto;
import com.ordenescompra.rest.repository.ProductoRepository;
import com.ordenescompra.rest.serviceImpl.ProductoServiceImpl;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {


	
	@Autowired
	private ProductoRepository productoRepository;
	
	
	
	@PutMapping("/updateprice/{codigo}")
	public ResponseEntity<?> update(@PathVariable String codigo ,@RequestBody Producto producto ){
		
		
		
		if (codigo!=null) {
					
		
			productoRepository.updatePriceByCode( codigo,  producto.getPrecio());
			
			
			return ResponseEntity.ok("Precio Modificado");
			
		}
		return ResponseEntity.notFound().build();
		
		
		
	}
	
	
	

}
