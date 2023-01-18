package com.ProjetoTeste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoTeste.course.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	

}
