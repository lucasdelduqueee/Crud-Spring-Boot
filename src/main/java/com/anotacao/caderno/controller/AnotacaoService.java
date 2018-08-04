package com.anotacao.caderno.controller;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anotacao.caderno.model.Anotacao;
import com.anotacao.caderno.repository.AnotacaoRepository;

@Service
public class AnotacaoService {

	@Autowired
	private AnotacaoRepository repository;
	
	public Anotacao atualizar(Long id, Anotacao anotacao) {
		Anotacao anotacaoSalva = repository.getOne(id);
		
		BeanUtils.copyProperties(anotacao, anotacaoSalva, "id", "cadastro");
		
		return repository.save(anotacaoSalva);
		
	}
}
