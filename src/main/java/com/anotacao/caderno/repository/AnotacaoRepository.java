package com.anotacao.caderno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anotacao.caderno.model.Anotacao;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long> {

}
