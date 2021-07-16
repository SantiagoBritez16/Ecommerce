package com.eccomerce.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal cantMinima = BigDecimal.TEN;
	private BigDecimal cantActual = BigDecimal.ZERO;
	private String nombre = "";
	private String descripcion = "";
	private BigDecimal precio = BigDecimal.ZERO;
	private String proveedor = "";
	private BigDecimal iva = new BigDecimal("1.21");

	public BigDecimal getPrecioConIva() {
		return iva.multiply(getPrecio());

	}

	private BigDecimal getPrecio() {
		return precio;
	}

	public BigDecimal getPrecioSinIva() {
		return getPrecio();
	}

	public boolean esProductoFaltante() {
		return cantActual.compareTo(cantMinima) <= 0;
	}

}
