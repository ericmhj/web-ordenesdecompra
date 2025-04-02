package com.ordenescompra.rest.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo (generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Builder
public class Orden {
	
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private Long id;
	//private String sucursal;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fecha;
	private BigDecimal total;
	

	@ManyToOne
	@JoinColumn(name = "id_sucursal", nullable = false)
	private Sucursal sucursal;

	
	@JsonManagedReference
	@OneToMany(mappedBy = "orden", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<Producto> productos = new ArrayList<>();
	
	
	
	
	
	
	
	
}
