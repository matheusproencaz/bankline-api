package com.dio.santander.bankline.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

}
