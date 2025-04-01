package com.ordenescompra.rest.service;

import java.util.List;
import java.util.Optional;

import com.ordenescompra.rest.entities.Sucursal;

public interface ISucursalService {
	
	void save(Sucursal sucursal);
	List<Sucursal> findAll();
	Optional<Sucursal> findById(Long id);
	void deleteById(Long id);
	Sucursal update(Sucursal sucursal);
	

}
