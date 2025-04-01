package com.ordenescompra.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ordenescompra.rest.entities.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
