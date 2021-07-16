package com.eccomerce.controladores;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping
public class MainController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/pagina2")
	public String pagdos() {
		return "segundapagina";
	}

}
