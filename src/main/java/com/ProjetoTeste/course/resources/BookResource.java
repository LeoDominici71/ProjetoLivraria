package com.ProjetoTeste.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoTeste.course.entities.Book;
import com.ProjetoTeste.course.services.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookResource {
	@Autowired
	private BookService service;
	
	@GetMapping
	public ResponseEntity<List<Book>> findAll(){
		List<Book> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Book> findById(@PathVariable Long id){
		Book bok = service.findById(id);
		return ResponseEntity.ok().body(bok);
	}

}
