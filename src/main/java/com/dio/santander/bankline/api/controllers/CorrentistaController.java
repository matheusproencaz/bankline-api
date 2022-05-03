package com.dio.santander.bankline.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.model.dto.NovoCorrentista;
import com.dio.santander.bankline.api.repositories.CorrentistaRepository;
import com.dio.santander.bankline.api.services.CorrentistaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Correntistas")
@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository repository;
	
	@Autowired
	private CorrentistaService service;
	
	@ApiOperation(value = "List All")
	@GetMapping
	public List<Correntista> findAll(){
		return repository.findAll();
	}
	
	@ApiOperation(value = "Create Correntista")
	@PostMapping
	public void save(@RequestBody NovoCorrentista novoCorrentista) {
		service.save(novoCorrentista);
	}
}
