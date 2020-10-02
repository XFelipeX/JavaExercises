package com.loiane.estruturadados.fila;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
	
	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public void enfileira(T elemento) {
		this.adiciona(elemento);
	}
	
	public T espiar() {
		if(this.estaVazio()) {
			return null;
		}
		return this.elementos[0];
	}
	
	public T desenfileira() {
		final int POS = 0;
		
		if(this.estaVazio()) {
			return null;
		}
		T elementoRemovido = elementos[POS];
		
		this.remove(POS);
		
		return elementoRemovido;
	}
}
