package com.ordenescompra.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ordenescompra.rest.entities.Sucursal;


@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Long> {

}
