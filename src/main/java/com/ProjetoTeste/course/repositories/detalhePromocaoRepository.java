package com.ProjetoTeste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoTeste.course.entities.DetalhesPromocao;

public interface detalhePromocaoRepository extends JpaRepository<DetalhesPromocao, Integer>{
	

}