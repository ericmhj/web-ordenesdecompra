package com.ordenescompra.rest.repository;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ordenescompra.rest.entities.Producto;

import jakarta.transaction.Transactional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

	@Modifying(clearAutomatically = true, flushAutomatically = true)
	@Transactional
	@Query("UPDATE Producto  p set  p.precio = ?2 WHERE p.codigo= ?1")
	void updatePriceByCode(String codigo, BigDecimal precioNuevo);
	
	
	
	
	
	
}
