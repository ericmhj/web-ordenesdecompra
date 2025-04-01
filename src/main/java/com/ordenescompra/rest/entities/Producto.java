package com.ordenescompra.rest.entities;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Builder

public class Producto {
	
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	
	private Long id;
	//private Long ordenId;
	private String codigo;
	private String descripcion;
	private BigDecimal precio;
	
	
	@ManyToOne
	@JoinColumn(name = "id_orden", nullable = false)
	@JsonIgnore
	private Orden orden;
	
	

}
