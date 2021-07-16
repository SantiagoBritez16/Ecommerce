package com.eccomerce.modelo;

public class Comprador extends Rol {
	private static final long serialVersionUID = 1L;
	private static final String TIPO = "Comprador";

	@Override
	public String getTipo() {
		return TIPO;
	}

}
