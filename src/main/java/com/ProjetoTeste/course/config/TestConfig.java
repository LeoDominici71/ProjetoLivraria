package com.ProjetoTeste.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ProjetoTeste.course.entities.Book;
import com.ProjetoTeste.course.repositories.BookRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		Book u1 = new Book(null, "A revolução dos bichos: Um conto de fadas", "George Orwell");
		Book u2 = new Book(null, "Amoras", "Emicida");
		Book u3 = new Book(null, "Perigoso!", "Tim Warnes");
		Book u4 = new Book(null, "O morro dos ventos uivantes", "Emily Brontë");
		
		bookRepository.saveAll(Arrays.asList(u1,u2,u3,u4));
		
		
		
		
	}

}
