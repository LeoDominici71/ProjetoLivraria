package com.ProjetoTeste.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoTeste.course.entities.Book;
import com.ProjetoTeste.course.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository repository;
	
	public List<Book> findAll(){
		return repository.findAll();
	}
	
	public Book findById(Long id) {
		Optional<Book> bok = repository.findById(id);
		return bok.get();
		
	}

}