package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula21 {
	public static void main(String[] args) {
		Fila<Character> fila = new Fila<>();
		fila.enfileira('a');
		fila.enfileira('b');
		fila.enfileira('c');
		System.out.println(fila);
		System.out.println(fila.espiar());
	}
}
