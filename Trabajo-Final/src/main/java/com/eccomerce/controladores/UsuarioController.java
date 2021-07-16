package com.eccomerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eccomerce.servicios.UsuarioService;

@Controller
@RequestMapping("usuarios")
public class UsuarioController {
	private UsuarioService usuarioService;

	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@RequestMapping("/listado")
	public String list(Model model) {
		model.addAttribute("personas", usuarioService.listarUsuarios());
		return "listado";
	}

}
