package com.loiane.estruturadadosvetor.labs;

import com.loiane.estruturadadosvetor.Lista;

public class Exer_03 {
	public static void main(String[] args) {
		Lista<String> lista = new Lista<>(5);
		
		lista.adiciona("a");
		lista.adiciona("b");
		lista.adiciona("c");
		lista.adiciona("d");
		lista.adiciona("e");
		
		System.out.println(lista);
		
		lista.remove("a");
		
		System.out.println(lista);
		
		lista.remove("e");
		
		System.out.println(lista);
	}
}
