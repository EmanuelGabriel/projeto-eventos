package com.example.meuprojeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.meuprojeto.model.EventoModel;
import com.example.meuprojeto.repository.EventoRepository;

@RestController
@RequestMapping(path = "api/eventos")
public class EventoService {
	
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@GetMapping
	public Iterable<EventoModel> lista(){
		
		return eventoRepository.findAll();
		
	}

	
	
	
	
	
	
	
	
	
}
