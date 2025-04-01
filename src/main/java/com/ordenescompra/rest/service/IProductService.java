package com.ordenescompra.rest.service;

import java.util.List;
import java.util.Optional;

import com.ordenescompra.rest.entities.Producto;

public interface IProductService {
	void save(Producto producto);
	List<Producto> findAll();
	Optional<Producto> findById(Long id);
	void deleteById(Long id);
	Producto update(Producto producto);

}
