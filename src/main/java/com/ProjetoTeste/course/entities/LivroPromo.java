package com.ProjetoTeste.course.entities;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.DecimalFormat;
import java.util.Objects;

import com.ProjetoTeste.course.entities.pk.LivroPromocao;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_LivroPromo")
public class LivroPromo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private LivroPromocao id = new LivroPromocao();
	private String precoAtualizado;
	private Double price;
	private Integer pct;
	
	
	public LivroPromo() {
	}

	public LivroPromo(Book book,DetalhesPromocao detPromo ,String precoAtualizado, Double price, Integer pct) {
		this.precoAtualizado = precoAtualizado;
		this.price = price;
		this.pct = pct;
		id.setBook(book);
		id.setdetPromo(detPromo);
	}

	public String getPrecoAtualizado() {
		return precoAtualizado;
	}

	public void setPrecoAtualizado(String precoAtualizado) {
		this.precoAtualizado = precoAtualizado;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getPct() {
		return pct;
	}

	public void setPct(Integer pct) {
		this.pct = pct;
	}
	
	
	public Book getBook() {
		return id.getBook();
	}
	
	public void setBook(Book book) {
		id.setBook(book);
	}
	
	
	public DetalhesPromocao getDetalhesPromocao() {
		return id.getdetPromo();
	}
	
	public void setDetalhesPromocao(DetalhesPromocao detPromo) {
		id.setdetPromo(detPromo);
	}
	
 
	
	
	public String desconto( DetalhesPromocao detPromo, Double price, Integer pct) {

		double sum = 0;
		

			if (detPromo.getTipo() == 2) {

				sum = price - price * pct / 100;

			} else if (detPromo.getTipo() == 1) {
				sum = price - price * pct / 100;

			} else if (detPromo.getTipo() == 3) {
				sum = price - price * pct / 100;

			}
			DecimalFormat df = new DecimalFormat("#,###.00");
			return df.format(sum); 
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
		LivroPromo other = (LivroPromo) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
	

	
	
	
	
	
	

}
