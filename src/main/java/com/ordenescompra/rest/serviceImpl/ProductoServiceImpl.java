package com.ordenescompra.rest.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ordenescompra.rest.entities.Producto;
import com.ordenescompra.rest.repository.ProductoRepository;
import com.ordenescompra.rest.service.IProductService;


@Service
public class ProductoServiceImpl implements IProductService {
	
	
	@Autowired
	private ProductoRepository productoRepository;
	
	

	@Override
	public void save(Producto producto) {
		// TODO Auto-generated method stub
		productoRepository.save(producto);

	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	public Optional<Producto> findById(Long id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Producto update(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePriceProductOrder(String codigo, Producto product) {
		// TODO Auto-generated method stub
		
		
		//TODO
	    //List<Long> ordesActualizar = 	productoRepository.findOrdersByCode(codigo);
	 
		
		
	}

}
