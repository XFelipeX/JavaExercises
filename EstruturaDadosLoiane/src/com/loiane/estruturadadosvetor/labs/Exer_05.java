package com.loiane.estruturadadosvetor.labs;

import java.util.ArrayList;

import com.loiane.estruturadadosvetor.Lista;

public class Exer_05 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		
		Lista<String> lista = new Lista<>(5);
		
		array.add("A");
		array.add("B");
		array.add("C");
		System.out.println("ArrayList");
		System.out.println(array);
		
		array.clear();
		
		System.out.println(array);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println("Lista");
		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);
	}
}
