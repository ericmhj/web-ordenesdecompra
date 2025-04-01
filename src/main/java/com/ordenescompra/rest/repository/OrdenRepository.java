package com.ordenescompra.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ordenescompra.rest.entities.Orden;


@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long> {

}
