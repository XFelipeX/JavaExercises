package com.loiane.estruturadados.fila.labs;

import com.loiane.estruturadados.fila.Fila;

public class Exer02 {
	public static void main(String[] args) {
		Fila<String> regular = new Fila<>();
		Fila<String> prioridade = new Fila<>();
		
		final int MAX_PRIORIDADE = 3;
		
		regular.enfileira("Pessoa 1");
		regular.enfileira("Pessoa 2");
		prioridade.enfileira("Pessoa 1P");
		prioridade.enfileira("Pessoa 2P");
		prioridade.enfileira("Pessoa 3P");
		prioridade.enfileira("Pessoa 4P");
		prioridade.enfileira("Pessoa 5P");
		prioridade.enfileira("Pessoa 6P");
		prioridade.enfileira("Pessoa 7P");
		regular.enfileira("Pessoa 3");
		regular.enfileira("Pessoa 4");
		regular.enfileira("Pessoa 5");
		
		while(!regular.estaVazio() || !prioridade.estaVazio()) {
			
			int cont = 0;
			
				while(!prioridade.estaVazio() && cont < MAX_PRIORIDADE) {
					atendePessoa(prioridade);
					cont++;
				}
				
				if(!regular.estaVazio()) {
					atendePessoa(regular);
				}
				
				if(prioridade.estaVazio()) {
					while(!regular.estaVazio()) {
						atendePessoa(regular);
					}
				}
		}
	}
	
	public static void atendePessoa(Fila<String> fila) {
		String pessoaAtendida = fila.desenfileira();
		System.out.println(pessoaAtendida + " foi atendida");
	}
}
