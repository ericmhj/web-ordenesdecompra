package com.ordenescompra.rest.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordenescompra.rest.entities.Sucursal;
import com.ordenescompra.rest.repository.SucursalRepository;
import com.ordenescompra.rest.service.ISucursalService;

@Service
public class SucursalServiceImpl implements ISucursalService {

	
	@Autowired
	private SucursalRepository sucursalRepository;
	
	@Override
	public void save(Sucursal sucursal) {
		// TODO Auto-generated method stub
		
		sucursalRepository.save(sucursal);

	}

	@Override
	public List<Sucursal> findAll() {
		// TODO Auto-generated method stub
		return sucursalRepository.findAll();
	}

	@Override
	public Optional<Sucursal> findById(Long id) {
		// TODO Auto-generated method stub
		return sucursalRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Sucursal update(Sucursal sucursal) {
		// TODO Auto-generated method stub
		return null;
	}

}
