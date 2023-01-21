package com.ProjetoTeste.course.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_promo")
public class DetalhesPromocao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tipo;
	private Integer pct;
	private Date inicio;
	private Date fim;
	
	@OneToMany(mappedBy = "promo")
	private List<Book> book = new ArrayList<>();
	
	
	
	public DetalhesPromocao() {
		
	}

	public DetalhesPromocao(Integer tipo, Integer pct, Date inicio, Date fim) {
		this.tipo = tipo;
		this.pct = pct;
		this.inicio = inicio;
		this.fim = fim;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getPct() {
		return pct;
	}

	public void setPct(Integer pct) {
		this.pct = pct;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalhesPromocao other = (DetalhesPromocao) obj;
		return Objects.equals(tipo, other.tipo);
	}

	
	
}