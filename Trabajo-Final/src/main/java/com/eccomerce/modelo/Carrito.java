package com.eccomerce.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "carritos")
@Getter
@Setter
@NoArgsConstructor
public class Carrito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Usuario usuario;
	private Date fechaCompra;
	private Date fechaDespacho;
	@Enumerated(EnumType.STRING)
	private EstadoCarrito estado = EstadoCarrito.ACTIVO;
	@OneToMany
	private List<Articulo> articulos = new ArrayList<>();

	public BigDecimal getMontoTotal() {
		Stream<BigDecimal> montos = articulos.stream().map(art -> art.getMonto());
		return montos.reduce(BigDecimal.ZERO, BigDecimal::add);

	};

}
