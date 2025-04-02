package com.ordenescompra.rest.entities;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo (generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Builder

public class Producto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Long id;
	//private Long ordenId;
	private String codigo;
	private String descripcion;
	private BigDecimal precio;
	
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "orden_id", nullable = true)
	private Orden orden;
	
	

}
