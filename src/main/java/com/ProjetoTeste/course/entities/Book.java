package com.ProjetoTeste.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String author; 
	
	public Book() {
		
	}

	public Book(Long id, String nome, String author) {
		this.id = id;
		this.nome = nome;
		this.author = author;
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
