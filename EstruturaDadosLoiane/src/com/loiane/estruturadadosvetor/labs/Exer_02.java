package com.loiane.estruturadadosvetor.labs;

import java.util.ArrayList;

import com.loiane.estruturadadosvetor.Lista;

public class Exer_02 {
	public static void main(String[] args) {
		Lista<String> lista = new Lista<>(5);
		lista.adiciona("a");
		lista.adiciona("b");
		lista.adiciona("a");
		System.out.println(lista.ultimoIndice("a"));
	}
}
