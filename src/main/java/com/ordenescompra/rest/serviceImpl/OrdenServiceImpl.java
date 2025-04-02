package com.ordenescompra.rest.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordenescompra.rest.entities.Orden;
import com.ordenescompra.rest.entities.Producto;
import com.ordenescompra.rest.entities.Sucursal;
import com.ordenescompra.rest.repository.OrdenRepository;
import com.ordenescompra.rest.repository.ProductoRepository;
import com.ordenescompra.rest.service.IOrdenService;

import jakarta.transaction.Transactional;


@Service
public class OrdenServiceImpl implements IOrdenService {
	
	@Autowired
	private OrdenRepository ordenRepository;
	
	@Override
	public void save(Orden orden) {
		// TODO Auto-generated method stub
		ordenRepository.save(orden);
				
	}

	@Override
	public List<Orden> findAll() {
		// TODO Auto-generated method stub
		return ordenRepository.findAll();
	}

	@Override
	public Optional<Orden> findById(Long id) {
		// TODO Auto-generated method stub
		return ordenRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Sucursal update(Orden orden) {
		// TODO Auto-generated method stub
		return null;
	}

}
