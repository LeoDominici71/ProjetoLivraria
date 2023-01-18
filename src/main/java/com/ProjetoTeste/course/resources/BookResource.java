package com.ProjetoTeste.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoTeste.course.entities.Book;

@RestController
@RequestMapping(value = "/books")
public class BookResource {
	@GetMapping
	public ResponseEntity<Book> findAll(){
		Book b = new Book(1L, "Malala", "Adriana Carranca");
		return ResponseEntity.ok().body(b);
		
	}

}
