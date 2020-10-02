package com.loiane.estruturadadosvetor.testes;

import com.loiane.estruturadadosvetor.Vetor;

public class Aula_09 {
	public static void main(String[] args) {
		Vetor v = new Vetor(10);
		
		v.adiciona("B");
		v.adiciona("C");
		v.adiciona("E");
		v.adiciona("F");
		v.adiciona("G");
		v.adiciona("H");
		
		System.out.println(v);
		v.remove(5);
		System.out.println(v);
		
		System.out.println("Remover elemento F");
		
		int pos = v.busca("F");
		if(pos > -1) {
			v.remove(pos);
		}else {
			System.out.println("Elemento não existe no vetor");
		}
		System.out.println(v);
	}
}
