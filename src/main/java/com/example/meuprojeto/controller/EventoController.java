package com.example.meuprojeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.meuprojeto.model.EventoModel;
import com.example.meuprojeto.repository.EventoRepository;

@Controller
@RequestMapping("/evento")
public class EventoController {
	
	private final String PAGINA_INICIAL = "index";
	
	
	@Autowired
	private EventoRepository er;
	
	/*@GetMapping("/")
	public String index() {
		
		return "evento/CadastroEvento";
		
	}*/
	

	@GetMapping("/cadastrarEvento")
	public String form() {
		
		return "evento/CadastroEvento";
	
	}
	
	
	

	
	//@RequestMapping(value = "/cadastrarEvento", method=RequestMethod.POST)
	@PostMapping("/cadastrarEvento")
	public String form(EventoModel evento) {
		
		er.save(evento);
		
		return "redirect:/evento/cadastrarEvento";
		
	}
	
	
	@RequestMapping("/eventos")
	public ModelAndView listaEventos() {
		
		ModelAndView mv = new ModelAndView(PAGINA_INICIAL);
		Iterable<EventoModel> eventos = er.findAll();
		mv.addObject("eventos", eventos);
		
		return mv;
		
		
		
	}
	
	
	
	
}
