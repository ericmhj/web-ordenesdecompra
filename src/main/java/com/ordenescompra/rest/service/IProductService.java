package com.ordenescompra.rest.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.ordenescompra.rest.entities.Producto;
import org.springframework.web.multipart.MultipartFile;

public interface IProductService {
	void save(Producto producto, MultipartFile multipartFile) throws IOException;
	List<Producto> findAll();
	Optional<Producto> findById(Long id);
	void deleteById(Long id);
	Producto update(Producto producto);
	void updatePriceProductOrder(String codigo,Producto  product);

}
