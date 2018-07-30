package com.anotacao.caderno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.anotacao.caderno.model.Anotacao;
import com.anotacao.caderno.repository.AnotacaoRepository;

@Controller
@RequestMapping("/anotacoes")
public class AnotacoesController {

	@Autowired
	private AnotacaoRepository repository;

	@GetMapping("/nova")
	public ModelAndView nova() {
		ModelAndView mv = new ModelAndView("anotacoes/anotacoes-cadastro");
		mv.addObject("anotacao", new Anotacao());
		return mv;
	}
	
	
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("anotacoes/anotacoes-lista");
		mv.addObject("anotacoes", repository.findAll());
		return mv;
	}

}
