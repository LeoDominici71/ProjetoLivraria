package com.ProjetoTeste.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoTeste.course.entities.DetalhesPromocao;
import com.ProjetoTeste.course.services.detalhesPromocaoService;

@RestController
@RequestMapping(value = "/DetalhesPromocaos")
public class detalhePromocaoResource {
	@Autowired
	private detalhesPromocaoService service;
	
	@GetMapping
	public ResponseEntity<List<DetalhesPromocao>> findAll(){
		List<DetalhesPromocao> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<DetalhesPromocao> findById(@PathVariable Integer id){
		DetalhesPromocao bok = service.findById(id);
		return ResponseEntity.ok().body(bok);
	}

}

