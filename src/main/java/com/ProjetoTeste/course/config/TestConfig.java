package com.ProjetoTeste.course.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ProjetoTeste.course.entities.Book;
import com.ProjetoTeste.course.entities.DetalhesPromocao;
import com.ProjetoTeste.course.repositories.BookRepository;
import com.ProjetoTeste.course.repositories.detalhePromocaoRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private detalhePromocaoRepository detPromocaoRepository;
	@Autowired
	private BookRepository bookRepository;
	

		
		@SuppressWarnings("deprecation")
		DetalhesPromocao det1 = new DetalhesPromocao(1, 5,new Date("2023/01/10"), new Date("2023/01/15"));
		
		@SuppressWarnings("deprecation")
		DetalhesPromocao det2 = new DetalhesPromocao(2, 10,new Date("2023/01/10"), new Date("2023/01/20"));
		
		@SuppressWarnings("deprecation")
		DetalhesPromocao det3 = new DetalhesPromocao(3, 15,new Date("2023/01/10"), new Date("2023/01/30")); 
		
		@Override
		public void run(String... args) throws Exception {
			Book u1 = new Book(null, "A revolução dos bichos: Um conto de fadas", "George Orwell",8.5 ,det2 );
			Book u2 = new Book(null, "Amoras", "Emicida",19.9,det1 );
			Book u3 = new Book(null, "Perigoso!", "Tim Warnes",16.9,det1);
			Book u4 = new Book(null, "O morro dos ventos uivantes","Emily Bronte",12.9, det1);
			
			detPromocaoRepository.saveAll(Arrays.asList(det1,det2,det3));
			
			bookRepository.saveAll(Arrays.asList(u1,u2,u3,u4));

		
		 
		
	}

}
