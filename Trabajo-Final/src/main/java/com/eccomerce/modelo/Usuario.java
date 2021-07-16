package com.eccomerce.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre = "";
	private String email = "";
	private String domicilio = "";
	private String whatsapp = "";
	@OneToMany
	private Set<Rol> roles = new HashSet<Rol>();
	private Boolean activo = Boolean.TRUE;
	@OneToMany(mappedBy = "usuario")
	private Set<Carrito> compras = new HashSet<>();

	public void activar() {
		this.activo = Boolean.TRUE;
	}

	public void desactivar() {
		this.activo = Boolean.FALSE;
	}

	public boolean tieneRol(Rol esteRol) {
		boolean tieneRol = false;
		for (Rol rol : roles) {
			if (rol.getTipo().equals(esteRol.getTipo())) {
				tieneRol = true;
				break;
			}
		}
		return tieneRol;
	}
}
