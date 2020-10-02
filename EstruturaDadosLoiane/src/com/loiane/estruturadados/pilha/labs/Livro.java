package com.loiane.estruturadados.pilha.labs;

public class Livro {
	private String isbn;
	private String autor;
	private String nome;
	private int anolancamento;
	
	
	
	public Livro() {
		super();
	}
	public Livro(String isbn, String autor, String nome, int anolancamento) {
		super();
		this.isbn = isbn;
		this.autor = autor;
		this.nome = nome;
		this.anolancamento = anolancamento;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnolancamento() {
		return anolancamento;
	}
	public void setAnolancamento(int anolancamento) {
		this.anolancamento = anolancamento;
	}
	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", autor=" + autor + ", nome=" + nome + ", anolancamento=" + anolancamento + "]";
	}
	
	
}
