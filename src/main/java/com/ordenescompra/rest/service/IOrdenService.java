package com.ordenescompra.rest.service;

import java.util.List;
import java.util.Optional;

import com.ordenescompra.rest.entities.Orden;
import com.ordenescompra.rest.entities.Sucursal;

public interface IOrdenService {
	
	void save(Orden orden);
	List<Orden> findAll();
	Optional<Orden> findById(Long id);
	void deleteById(Long id);
	Sucursal update(Orden orden);

}
