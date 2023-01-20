package com.ProjetoTeste.course.entities;

import java.io.Serializable;
import java.util.Objects;

import com.ProjetoTeste.course.entities.enums.DetalhesPromocaoEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_book")
public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String author;
	private Double price;
	private DetalhesPromocaoEnum tipoP;
	
	public Book() {
		
	}

	public Book(Long id, String nome, String author, Double price, DetalhesPromocaoEnum tipoP) {
		this.id = id;
		this.nome = nome;
		this.author = author;
		this.price = price;
		this.tipoP = tipoP;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public DetalhesPromocaoEnum getTipoP() {
		return tipoP;
	}

	public void setTipoP(DetalhesPromocaoEnum tipoP) {
		this.tipoP = tipoP;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id);
	}
	
	

	
	

}
