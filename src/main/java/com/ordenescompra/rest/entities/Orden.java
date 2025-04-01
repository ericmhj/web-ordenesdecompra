package com.ordenescompra.rest.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Orden {
	
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private Long id;
	//private String sucursal;
	private Date fecha;
	private BigDecimal total;
	

	@ManyToOne
	@JoinColumn(name = "id_sucursal", nullable = false)
	@JsonIgnore
	private Sucursal sucursal;

	
	
	@OneToMany(mappedBy = "orden", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JsonIgnore
	Set<Producto> productos;
	
	
	
	
	
	
	
	
}
