package com.projeto.futebol.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.futebol.entities.Pagamento;
import com.projeto.futebol.repositories.PagamentoRepository;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoController {
	
	@Autowired
	private PagamentoRepository repository;
	
	@GetMapping
	public List<Pagamento> findAll(){
		List<Pagamento> result = repository.findAll();
		return result;
		
	}
	@GetMapping(value = "/{id}")
	public Pagamento findById(@PathVariable Integer id){
		Pagamento result = repository.findById(id).get();
		return result;
		
	}
	
	@PostMapping
	public Pagamento insert(@RequestBody Pagamento pagamento){
		Pagamento result = repository.save(pagamento);
		return result;
		
	}


}
