package com.ProjetoTeste.course.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.ProjetoTeste.course.entities.Book;
import com.ProjetoTeste.course.entities.DetalhesPromocao;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Embeddable
public class LivroPromocao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book; 
	@ManyToOne
	@JoinColumn(name = "detPromo_tipo")
	private DetalhesPromocao detPromo;
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public DetalhesPromocao getdetPromo() {
		return detPromo;
	}
	public void setdetPromo(DetalhesPromocao detPromo) {
		this.detPromo = detPromo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(book, detPromo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LivroPromocao other = (LivroPromocao) obj;
		return Objects.equals(book, other.book) && Objects.equals(detPromo, other.detPromo);
	}
	

}
