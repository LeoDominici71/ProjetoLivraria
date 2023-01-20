package com.ProjetoTeste.course.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ProjetoTeste.course.entities.enums.DetalhesPromocaoEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_promo")
public class DetalhesPromocao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private DetalhesPromocaoEnum tipo;
	private Integer pct;
	private Date inicio;
	private Date fim;
	
	@OneToMany(mappedBy = "tipoP")
	private List<Book> book = new ArrayList<>();

	public DetalhesPromocao(DetalhesPromocaoEnum tipo, Integer pct, Date inicio, Date fim, List<Book> book) {
		this.tipo = tipo;
		this.pct = pct;
		this.inicio = inicio;
		this.fim = fim;
		this.book = book;
	}

	public DetalhesPromocaoEnum getTipo() {
		return tipo;
	}

	public void setTipo(DetalhesPromocaoEnum tipo) {
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

	

	 
	


	
	
	
	
	
	

}
