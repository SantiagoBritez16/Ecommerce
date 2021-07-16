package com.eccomerce.modelo;

public class Administrador extends Rol{
	private static final long serialVersionUID = 1L;
	private static final String TIPO = "Administrador";
	
	@Override
	public String getTipo() {
		return TIPO;
	}

}
