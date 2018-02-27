package com.example.meuprojeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.meuprojeto.model.EventoModel;
import com.example.meuprojeto.repository.EventoRepository;

@Controller
public class EventoController {
	
	private final String PAGINA_INICIAL = "index";
	
	
	@Autowired
	private EventoRepository er;

	
	@RequestMapping(value = "/cadastrarEvento", method=RequestMethod.GET)
	public String form() {
		
		return "evento/CadastroEvento";
	
	}
	

	
	@RequestMapping(value = "/cadastrarEvento", method=RequestMethod.POST)
	public String form(EventoModel evento) {
		
		er.save(evento);
		
		return "redirect:/cadastrarEvento";
		
	}
	
	
	@RequestMapping("/eventos")
	public ModelAndView listaEventos() {
		
		ModelAndView mv = new ModelAndView(PAGINA_INICIAL);
		Iterable<EventoModel> eventos = er.findAll();
		mv.addObject("eventos", eventos);
		
		return mv;
		
		
		
	}
	
	
	
	
}