package com.loiane.estruturadadosvetor.testes;

import com.loiane.estruturadadosvetor.Vetor;

public class Aula_06 {
	public static void main(String[] args) {
		Vetor v = new Vetor(4);
		v.adiciona("elemento 1");
		v.adiciona("elemento 2");
		v.adiciona("elemento 3");
		
		System.out.println(v.busca("elemento 1"));
	}
}
