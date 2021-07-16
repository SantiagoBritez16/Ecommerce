package com.eccomerce.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eccomerce.modelo.Usuario;
import com.eccomerce.repositorios.UsuarioRepository;
import com.eccomerce.modelo.Usuario;

@Service
public class UsuarioService {

	private UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public List<Usuario> listarUsuarios() {
		return usuarioRepository.findAll();
	}

}
