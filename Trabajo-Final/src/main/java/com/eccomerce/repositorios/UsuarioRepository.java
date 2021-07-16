package com.eccomerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eccomerce.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
