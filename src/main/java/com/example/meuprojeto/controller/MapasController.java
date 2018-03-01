package com.example.meuprojeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/evento")
public class MapasController {

	private final String PAGINA_MAPAS_EVENTO = "mapas/MapasEvento";
	
	@GetMapping("/mapasEvento")
	public String form() {
		
		return PAGINA_MAPAS_EVENTO;
	
	}
	
	
	
	
	
	
}
