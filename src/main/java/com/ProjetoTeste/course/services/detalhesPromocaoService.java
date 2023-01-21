package com.ProjetoTeste.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoTeste.course.entities.DetalhesPromocao;
import com.ProjetoTeste.course.repositories.detalhePromocaoRepository;

@Service
public class detalhesPromocaoService {
	
	@Autowired
	private detalhePromocaoRepository repository;
	
	public List<DetalhesPromocao> findAll(){
		return repository.findAll();
	}
	
	public DetalhesPromocao findById(Integer tipo) {
		Optional<DetalhesPromocao> bok = repository.findById(tipo);
		return bok.get();
		
	}

}

