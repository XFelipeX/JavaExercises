package com.loiane.estruturadadosvetor.testes;

import com.loiane.estruturadadosvetor.Vetor;

public class Aula_07 {
	public static void main(String[] args) {
		Vetor v = new Vetor(10);
		
		v.adiciona("B");
		v.adiciona("C");
		v.adiciona("E");
		v.adiciona("F");
		v.adiciona("G");
		v.adiciona("H");
		
		System.out.println(v);
		v.adiciona(0,"A");
		System.out.println(v);
		v.adiciona(3,"D");
		System.out.println(v);
	}
}
