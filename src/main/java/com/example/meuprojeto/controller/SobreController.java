package com.example.meuprojeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/evento")
public class SobreController {

	
	private final String PAGINA_SOBRE = "/sobre/pagina_sobre";
	
	
	@GetMapping("/sobre")
	public String sobre() {
		
		return PAGINA_SOBRE;
	}
	
	
	
	
	
}
