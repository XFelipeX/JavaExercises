package com.loiane.estruturadadosvetor.labs;

import com.loiane.estruturadadosvetor.Lista;

public class Exer_04 {
	public static void main(String[] args) {
		Lista<String> lista = new Lista<>(5);

		lista.adiciona("a");
		lista.adiciona("b");
		lista.adiciona("c");
		lista.adiciona("d");
		lista.adiciona("e");

		System.out.println(lista.obtem(0));
		System.out.println(lista.obtem(1));
		System.out.println(lista.obtem(4));
	}
}
