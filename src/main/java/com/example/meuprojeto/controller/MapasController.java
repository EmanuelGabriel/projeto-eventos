package com.example.meuprojeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapasController {

	@RequestMapping("/mapasEvento")
	public String form() {
		
		return "mapas/MapasEvento";
	
	}
	
	
	
	
	
}
