package com.loiane.estruturadadosvetor;

public class VetorObjeto {
	private Object[] elementos;
	private int tamanho = 0;
	
	public VetorObjeto(int capacidade) {
		this.elementos = new Object[capacidade];
	}
	
	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		
		for(int i=posicao;i<this.tamanho-1;i++) {
			this.elementos[i] = this.elementos[i+1];
			
		}
		
		this.tamanho--;
	}
	
	public boolean adiciona(Object elemento) {
		this.aumentaCapacidade();
		if(this.tamanho<elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}else {
			return false;
		}
		
	}
	
	public void adiciona(int posicao,Object elemento) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		
		this.aumentaCapacidade();
		
		//mover todos os elementos
		for(int i=this.tamanho-1;i>=posicao;i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new Object[this.elementos.length*2];
			for(int i=0;i<tamanho;i++) {
				elementosNovos[i] = elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public Object busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		return this.elementos[posicao];
	}
	
	public int busca(Object elemento) {
		for(int i = 0; i<this.tamanho;i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		
		for(int i=0;i<this.tamanho-1;i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
				
		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
}
