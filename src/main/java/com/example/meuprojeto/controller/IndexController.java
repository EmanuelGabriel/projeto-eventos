package com.example.meuprojeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	private final String PAGINA_INDEX = "index";

    @RequestMapping("/")	
	public String index() {
	
		return PAGINA_INDEX;
	}
    
    
    
    
	
}
