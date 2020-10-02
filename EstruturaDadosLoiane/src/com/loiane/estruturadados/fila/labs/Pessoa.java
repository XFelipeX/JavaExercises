package com.loiane.estruturadados.fila.labs;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private int prioridade;
	
	public Pessoa() {}

	public Pessoa(String nome, int prioridade) {
		super();
		this.nome = nome;
		this.prioridade = prioridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public int compareTo(Pessoa p) {
		if(this.prioridade > p.prioridade) {
			return 1;
		} else if(this.prioridade < p.prioridade) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", prioridade=" + prioridade + "]";
	}
	
	
}
