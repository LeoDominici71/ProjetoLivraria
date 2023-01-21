package com.ProjetoTeste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoTeste.course.entities.DetalhesPromocao;
import com.ProjetoTeste.course.entities.LivroPromo;

public interface LivroPromoRepository extends JpaRepository<LivroPromo, Integer>{
	

}