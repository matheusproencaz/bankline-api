package com.dio.santander.bankline.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.model.Movimentacao;
import com.dio.santander.bankline.api.model.dto.NovaMovimentacao;
import com.dio.santander.bankline.api.repositories.MovimentacaoRepository;
import com.dio.santander.bankline.api.services.MovimentacaoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Movimentação")
@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	@ApiOperation(value = "List All")
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll();
	}
	
	@ApiOperation(value = "Create Correntista")
	@PostMapping
	public void save(@RequestBody NovaMovimentacao novaMovimentacao) {
		service.save(novaMovimentacao);
	}
}
